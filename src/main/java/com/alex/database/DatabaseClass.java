package com.alex.database;

import com.alex.model.User;
import com.alex.model.filters.PriceFilter;

import java.util.HashMap;
import java.util.Map;


public class DatabaseClass {

    public static Map<String, User> users = new HashMap<>();
    //Our database
    static {
        users.put("David", new User("David", new PriceFilter(0, 2000)));
        users.put("Grant", new User ("Grant", new PriceFilter(2000, Integer.MAX_VALUE)));
    }

    public static User getUser(String username){
        return users.get(username);
    }
}
