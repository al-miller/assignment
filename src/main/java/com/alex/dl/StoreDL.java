package com.alex.dl;

import com.alex.model.StoreBean;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class StoreDL {

    public StoreBean getStoreName(){
        Client client = ClientBuilder.newClient();
        WebTarget baseTarget = client.target("http://lcboapi.com");
        WebTarget storesTarget = baseTarget.path("stores/643");
        //WebTarget singleStoreTarget = storesTarget.path("{storeId}");

        Response response = storesTarget

                .request(MediaType.APPLICATION_JSON)
                .get();
        StoreBean sb = response.readEntity(StoreBean.class);

        return sb;
    }
    public Response getStoreName2(String id){
        Client client = ClientBuilder.newClient()
                .register(JacksonFeature.class);
        WebTarget baseTarget = client.target("http://lcboapi.com");
        WebTarget storesTarget = baseTarget.path("stores");
        WebTarget singleStoreTarget = storesTarget.path("{storeId}");

        Response response = singleStoreTarget
                .resolveTemplate("storeId", id)
                .request(MediaType.APPLICATION_JSON)
                .get();
        //StoreBean sb = response.readEntity(StoreBean.class);
//        String output = response.readEntity(String.class);
        //System.out.println(" "+sb.getName());
        return response;
    }
}
