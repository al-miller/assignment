package com.alex.dl;

import com.alex.bl.WineBL;
import com.alex.model.WineWrapper;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class WineDL {

    public static final String baseUrl =  "http://lcboapi.com/stores/643/products";
    public static final String WINES_PER_PAGE =  "10";



    public WineWrapper getWines(WineBL.WineType wineType, Integer nextPage) {

        if (nextPage != null) {
            Client client = ClientBuilder.newClient().register(JacksonFeature.class);
            WebTarget baseTarget = client.target(baseUrl);
            WebTarget winesTarget = baseTarget
                    .queryParam("where_not", "is_dead")
                    .queryParam("primary_category", "Wine")
                    .queryParam("q", "wine")
                    .queryParam("page", nextPage)
                    .queryParam("per_page", WINES_PER_PAGE)
                    .queryParam("q", WineBL.WineType.RED.equals(wineType) ? "red wine" : "white wine");
            try {
                Response response = winesTarget.request().get();
                return response.readEntity(WineWrapper.class);

            } catch (Exception e) {
                throw new InternalServerErrorException("Sorry, something went wrong");
            }
        }
        return null;
    }
}