package com.alex.bl;

import com.alex.dl.WineDL;
import com.alex.model.Pager;
import com.alex.model.User;
import com.alex.model.Wine;
import com.alex.model.WineWrapper;
import com.alex.model.filters.Filter;
import com.alex.resources.UserController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

public class WineBL {

    private WineDL _wineDL;

    public WineBL() {
        _wineDL = new WineDL();
    }

    public enum WineType{
        WHITE("WHITE"),
        RED("RED");

        String name;

        WineType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public Wine getNextWine(HttpSession session) {

        Wine selected = null;
        WineType wineType = getWineType();

        WineWrapper wineWrapper = getWinesListFromSession(wineType, session);

        if (isWineListEmpty(wineWrapper)){
            wineWrapper = getMatchingWineFromApi(session, wineType);/*ToDo (by Alex): call next page with wines*/
        }

        if (!isWineListEmpty(wineWrapper)){
            selected = removeWineFromWrapper(wineWrapper);
        }

        updateSession(wineType,session,wineWrapper);

        return selected;
    }

    private Wine removeWineFromWrapper(WineWrapper wineWrapper) {
        Wine selected;
        List<Wine> wineList = wineWrapper.getWines();
        selected = wineList.get(0) ;
        wineList.remove(selected);
        wineWrapper.setWines(wineList);
        return selected;
    }


    private WineWrapper getWinesListFromSession(WineType wineType, HttpSession session) {
        return  (WineWrapper)session.getAttribute(wineType.getName());
    }

    private WineWrapper getMatchingWineFromApi(HttpSession session, WineType wineType) {

        WineWrapper wineWrapperFromSession = (WineWrapper) session.getAttribute(wineType.getName());
        Pager pager = wineWrapperFromSession.getPager();
        Integer nextPage = pager.get_isFinalPage() ? null : pager.getNextPage();


        WineWrapper wineWrapper = getWineDL().getWines(wineType,nextPage);
        if (wineWrapper != null) {
            User user = (User) session.getAttribute(UserController.USER);
            Filter priceFilter = user.getFilter();
            List<Wine> filtered = priceFilter.filter(wineWrapper.getWines());
            wineWrapper.setWines(filtered);
        }
        return wineWrapper;
    }

    private void updateSession(WineType wineType, HttpSession session, WineWrapper wineWrapper) {

        session.setAttribute(wineType.getName() ,wineWrapper);

    }

    private WineType getWineType() {
        Random rand = new Random();
        int val = rand.nextInt(4) + 1;
        return val != 1 ? WineType.RED : WineType.WHITE;
    }

    private boolean isWineListEmpty(WineWrapper wineWrapper) {
        return wineWrapper == null || wineWrapper.getWines() == null || wineWrapper.getWines() .isEmpty();
    }






    public WineDL getWineDL() {
        return _wineDL;
    }
}
