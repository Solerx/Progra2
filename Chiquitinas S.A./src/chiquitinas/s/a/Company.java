/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiquitinas.s.a;

import java.util.ArrayList;

/**
 *
 * @author Soler
 */
public class Company {

    int id;
    String name;
    String direction;
    int phone;
    ArrayList<Order> listOfOrders;

    public Company(int id, String name, String direction, int phone, ArrayList<Order> listOfOrders) {

        this.id = id;
        this.name = name;
        this.direction = direction;
        this.phone = phone;
        this.listOfOrders = listOfOrders;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ArrayList<Order> getListOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(ArrayList<Order> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }

}
