package com.alex.resources;

import com.alex.bl.WineBL;
import com.alex.database.DatabaseClass;
import com.alex.model.Pager;
import com.alex.model.User;
import com.alex.model.Wine;
import com.alex.model.WineWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.util.ArrayList;

//
@Path("/login")
public class UserController {

    public static final String RED_WINE = "red_wines";
    public static final String WHITE_WINE = "white_wines";
/*    public static final String RED_WINES_PAGER = "red_wines";
    public static final String WHITE_WINES = "white_wines";
    public static final String WINE_PAGER = "wines_pagers";*/
    public static final String USER = "user";


    @POST

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User login(@Context UriInfo uriInfo,@Context HttpServletRequest request,@NotNull User user){

        User userFromDB = DatabaseClass.getUser(user.getUserName());
        if(userFromDB == null){
            throw new IllegalArgumentException("No such user");
        }
        initSessionAttributes(request, userFromDB);
        return userFromDB;

    }

    private void initSessionAttributes(@Context HttpServletRequest request, User userFromDB) {
        HttpSession session = request.getSession(true);
        session.setAttribute(USER, userFromDB);

        session.setAttribute(WineBL.WineType.WHITE.getName(),new WineWrapper(new Pager(false,1),new ArrayList<Wine>()));
        session.setAttribute(WineBL.WineType.RED.getName(),new WineWrapper(new Pager(false,1),new ArrayList<Wine>()));

    }

}
