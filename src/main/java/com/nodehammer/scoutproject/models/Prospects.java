package com.nodehammer.scoutproject.models;

/**
 * Created by Darren on 5/12/2017.
 */
public class Prospects {

    private String name;
    private String bios;
    private int playerId;
    private static int nextId = 1;

    public Prospects(String name, String bios) {
        this.name = name;
        this.bios = bios;
    }

    public Prospects () {
        playerId = nextId;
        nextId++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}