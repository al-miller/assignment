package com.alex;

import com.alex.dl.StoreDL;
import com.alex.dl.WineDL;
import com.alex.model.Wine;
import com.alex.model.WineWrapper;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        String baseUrl =  "http://lcboapi.com/stores/643/products";

        Client client = ClientBuilder.newClient().register(JacksonFeature.class);
        WebTarget baseTarget = client.target(baseUrl);
//        WebTarget redWinesTarget = baseTarget.path("products?q=red+wine");
        WebTarget redWinesTarget= baseTarget.queryParam("where_not","is_dead").queryParam("primary_category", "Wine").queryParam("q","wine").queryParam("q", "red wine").queryParam("per_page","100");
        //WebTarget red = client.target("http://lcboapi.com/stores/643/products?q=red+wine");


        try {
            Response response = redWinesTarget.request().get();
            WineWrapper wineWrapper = response.readEntity(WineWrapper.class);
            List<Wine> wines = wineWrapper.getWines();

        } catch (Exception e) {
            e.printStackTrace();
        }








        WineDL wdl = new WineDL();
        StoreDL sdl = new StoreDL();
//        wdl.getStore(new PriceFilter(0.0, 20.0));
//
//        System.out.println(r.toString());


//      StoreBean sb = sdl.getStoreName();
//       System.out.println(sb.getName());
//
//       Response r = sdl.getStoreName2("643");


/*        Client client = ClientBuilder.newClient().register(JacksonFeature.class);
        WebTarget baseTarget = client.target("http://lcboapi.com");
        WebTarget storesTarget = baseTarget.path("stores");
        WebTarget singleStoreTarget = storesTarget.path("{storeId}");

        Response response = singleStoreTarget
                .resolveTemplate("storeId", "643")
                .request(MediaType.APPLICATION_JSON)
                .get();
        StoreBean sb = response.readEntity(StoreBean.class);

        try {



            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }*/


//        System.out.println(r.toString());
//       System.out.println(sb.getName());

//        try {
//
////            Object entity = r.getEntity();
//
//            StoreBean storeBean = r.readEntity(StoreBean.class);
////            StoreBean2 storeBean = r.readEntity(StoreBean2.class);
//
//            System.out.println("yalla");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("yalla");

//        Response re = wdl.getRedWines();
//        String x = re.toString();
//        String x = re.toString();
//        System.out.println(x);



    }
}
