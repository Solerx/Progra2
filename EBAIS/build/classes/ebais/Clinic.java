/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebais;

public class Clinic {

    private int id;
    private String name;
    private int stretchers;

    public Clinic() {
        //Default      

    }

    public Clinic(String name, int stretchers) {
        //Sobrecargado

    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setStretchers(int stretchers) {

        this.stretchers = stretchers;
    }

    public int getStretchers() {

        return stretchers;
    }

    @Override
    public String toString() {
        return "Clinic{" + "id=" + id + ", name=" + name + ", stretchers=" + stretchers + '}';
    }
    
    
}
