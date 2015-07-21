/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajes;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Soler
 */

public class MensajeSalida extends Mensaje{
    
    private ArrayList<Contacto> listOfContactos;
    
    public MensajeSalida(Calendar fecha, String texto, ArrayList<Contacto> listOfContactos){
        
        super(fecha, texto);
        this.listOfContactos = listOfContactos;
    
    }

    public ArrayList<Contacto> getListOfContactos() {
        return listOfContactos;
    }

    public void setListOfContactos(ArrayList<Contacto> listOfContactos) {
        this.listOfContactos = listOfContactos;
    }

    @Override
    public String toString() {
        return "MensajeSalida{" + "listOfContactos=" + listOfContactos + '}';
    }

    @Override
    public void getAlgo() {
        
        System.out.println("Mensaje de metodo abstracto.");
        
    }
    
    
}
