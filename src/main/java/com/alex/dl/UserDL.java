package com.alex.dl;

import com.alex.database.DatabaseClass;
import com.alex.model.User;

//user data layer
public class UserDL {


    public boolean authenticateUser(User user) {
        if(DatabaseClass.users.containsValue(user.getUserName()))
        {    return true;}
        else{
            return false;
        }

    }
}
