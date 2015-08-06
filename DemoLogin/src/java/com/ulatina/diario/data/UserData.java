/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.diario.data;

import java.util.ArrayList;

/**
 *
 * @author Soler
 */
public class UserData {

    private String user;
    private String password;
    private String name;
    private ArrayList<UserData> userList = new ArrayList<UserData>();

    public UserData() {

        userList.add(new UserData("Bernal", "1234", "Bernal Fernandez"));
        userList.add(new UserData("Carlos", "1234", "Carlos Soto"));
        userList.add(new UserData("Asdrubal", "1234", "Asdrubal Pachano"));
    }

    public UserData(String user, String password, String name) {
        this.user = user;
        this.password = password;
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserData userValidation(String user, String password) {

        for (UserData d : this.userList) {

            if (d.getUser().equals(user)) {

                if (d.getPassword().equals(password)) {

                    return d;
                }
            }

        }

        return null;
    }

}
