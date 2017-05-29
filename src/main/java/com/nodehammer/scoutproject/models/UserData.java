package com.nodehammer.scoutproject.models;

import java.util.ArrayList;

/**
 * Created by Darren on 5/15/2017.
 */
public class UserData {

    static ArrayList<Users> users = new ArrayList<>();

    // getAll
    public static ArrayList<Users> getAll(){
        return users;
    }

    // add
    public static void add(Users newUser){
        users.add(newUser);

    }
    // remove
    public static void remove(int id){
        Users userToRemove = getUserId(id);
        users.remove(userToRemove);
    }

    //getById
    public static Users getUserId(int id) {
        Users theUser = null;

        for (Users candidateUser : users) {
            if (candidateUser.getUserId() == id) {
                theUser = candidateUser;
            }
        }


        return theUser;
    }
}
