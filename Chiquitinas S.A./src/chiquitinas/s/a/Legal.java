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
public class Legal extends Client{
    
    String responsible;

    public Legal(int id, String name, String direction, int phone, String responsible) {
        
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
