package com.hcs.prototype.hcs_prototype;

import android.content.Context;

/**
 * Created by mitch on 2015/08/16.
 */
public class UserNormal extends User {
    /**
     * Create a new user object
     */
    private UserNormal (){
        super();
    }
    /**
     * Create a new user object
     * @param username the user's username
     * @param password the user's password
     * @param context the context which the data will be obtained from
     */
    private UserNormal(String username, String password, Context context){
        super(username, password, context);
    }
}
