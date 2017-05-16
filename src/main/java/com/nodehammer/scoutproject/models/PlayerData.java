package com.nodehammer.scoutproject.models;

import java.util.ArrayList;

/**
 * Created by Darren on 5/15/2017.
 */
public class PlayerData {

    static ArrayList<Prospects> players = new ArrayList<>();

    // getAll
    public static ArrayList<Prospects> getAll(){
        return players;
    }

    // add
    public static void add(Prospects newPlayer){
        players.add(newPlayer);

    }
    // remove
    public static void remove(int id){
        Prospects playerToRemove = getById(id);
        players.remove(playerToRemove);
    }

    //getById
    public static Prospects getById(int id) {
        Prospects thePlayer = null;

        for (Prospects candidatePlayer : players) {
            if (candidatePlayer.getPlayerId() == id) {
                thePlayer = candidatePlayer;
            }
        }

        return thePlayer;
    }
}
