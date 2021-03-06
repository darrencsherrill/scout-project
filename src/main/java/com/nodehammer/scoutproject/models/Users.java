package com.nodehammer.scoutproject.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Darren on 5/19/2017.
 */
public class Users {


    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String city;
    private String state;
    private Integer zip;
    private int userId;
    private static int nextId = 1;

    public Users(String username, String password, String firstname, String lastname,
                 String email, String address, String city, String state, Integer zip) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Users () {
        userId = nextId;
        nextId++;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {this.password = password;}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {this.userId = userId;}
}
