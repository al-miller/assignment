package com.alex.resources;

import com.alex.bl.WineBL;
import com.alex.model.Wine;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

//
@Path("/wines")
public class WineController {

    WineBL wineBL;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //picking new wine
    public Wine getNextWine(@Context UriInfo uriInfo, @Context HttpServletRequest request) {


        HttpSession session = request.getSession();
        if (session == null || session.getAttribute(UserController.USER) == null) {
            throw new InternalServerErrorException("Sorry. Something went wrong. Please contact support");
        }
        //pick a new wine according to a price ant wine type(red/white)
        Wine nextWine = getWineBL().getNextWine(session);
        if(nextWine == null){
            throw new InternalServerErrorException("No more wines");
        }

        return nextWine;

    }

    public WineBL getWineBL() {
        return new WineBL();
    }

    public void setWineBL(WineBL wineBL) {
        this.wineBL = wineBL;
    }
}
