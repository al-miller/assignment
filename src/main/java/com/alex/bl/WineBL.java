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
//Business layer - BL


public class WineBL {

    private WineDL _wineDL;

    public WineBL() {
        _wineDL = new WineDL();
    }

    public enum WineType {
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

//calling api to pull set of wines which passed our filter(type was drawn + price) and saving list of matching ones in session. If user rejects and same type drawn then we pull from already existing matching list,
//when the list is empty , another api call initiated
//  if another type drawn, we call api again and store another list of matching wines. We store page number for white & red wines in order to pull new ones if needed
    public Wine getNextWine(HttpSession session) { //returns new wine according to requirements

        Wine selected = null;
        WineType wineType = getWineType();

        WineWrapper wineWrapper = getWinesListFromSession(wineType, session);

        if (isWineListEmpty(wineWrapper)) {
            wineWrapper = getMatchingWineFromApi(session, wineType);
        }

        if (!isWineListEmpty(wineWrapper)) {
            selected = removeWineFromWrapper(wineWrapper);
        }

        updateSession(wineType, session, wineWrapper);//updating list

        return selected;
    }

//remove already shown wine from the filtered wines list
    private Wine removeWineFromWrapper(WineWrapper wineWrapper) {
        Wine selected;
        List<Wine> wineList = wineWrapper.getWines();
        selected = wineList.get(0);
        wineList.remove(selected);
        wineWrapper.setWines(wineList);
        return selected;
    }

    //user matching wines that already pulled from api
    private WineWrapper getWinesListFromSession(WineType wineType, HttpSession session) {
        return (WineWrapper) session.getAttribute(wineType.getName());
    }


    //get new wines from api according to type,price, page.(no matching wines from last api call left)
    private WineWrapper getMatchingWineFromApi(HttpSession session, WineType wineType) {

        WineWrapper wineWrapperFromSession = (WineWrapper) session.getAttribute(wineType.getName());
        Pager pager = wineWrapperFromSession.getPager();
        Integer nextPage = pager.get_isFinalPage() ? null : pager.getNextPage();


        WineWrapper wineWrapper = getWineDL().getWines(wineType, nextPage); //data layer - api call
        if (wineWrapper != null) {
            User user = (User) session.getAttribute(UserController.USER);
            Filter priceFilter = user.getFilter();
            List<Wine> filtered = priceFilter.filter(wineWrapper.getWines());
            wineWrapper.setWines(filtered);
        }
        return wineWrapper;
    }

    private void updateSession(WineType wineType, HttpSession session, WineWrapper wineWrapper) {

        session.setAttribute(wineType.getName(), wineWrapper);

    }


    //choose randomly red/white with probability 0.25 for white
    private WineType getWineType() {
        Random rand = new Random();
        int val = rand.nextInt(4) + 1;
        return val != 1 ? WineType.RED : WineType.WHITE;
    }

    private boolean isWineListEmpty(WineWrapper wineWrapper) {
        return wineWrapper == null || wineWrapper.getWines() == null || wineWrapper.getWines().isEmpty();
    }


    public WineDL getWineDL() {
        return _wineDL;
    }
}
