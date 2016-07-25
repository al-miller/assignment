package com.alex.bl;

import com.alex.dl.UserDL;
import com.alex.model.User;


public class UserBL {

    private UserDL _userDL;

    public UserDL get_userDL() {
        return _userDL;
    }

    public void set_userDL(UserDL _userDL) {
        this._userDL = _userDL;
    }

    public boolean authenticateUser(User user){

        return get_userDL().authenticateUser(user);
    }


}
