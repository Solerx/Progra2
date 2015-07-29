/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiquitinas.s.a;

/**
 *
 * @author Soler
 */
public abstract class Client {
    
    private int id;
    private String name;
    private String direction;
    private int phone;
    
    public Client(int id, String name, String direction, int phone){
        
        this.id=id;
        this.name=name;
        this.direction=direction;
        this.phone = phone;
    
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
    
    public String getResponsible (Client c){
        
        String responsible = "";
        
    if (c instanceof Legal){
        
       responsible = ((Legal)c).responsible;
        
        }else{
        
        responsible = "-----";
    }
    
    return responsible;
    }
    
}
