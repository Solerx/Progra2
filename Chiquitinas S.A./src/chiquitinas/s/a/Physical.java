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
public class Physical extends Client{
    
    String responsible;

    public Physical(int id, String name, String direction, int phone) {
        super(id, name, direction, phone);
    }

    public Physical(String responsible, int id, String name, String direction, int phone) {
        super(id, name, direction, phone);
        this.responsible = responsible;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
    
    
}
