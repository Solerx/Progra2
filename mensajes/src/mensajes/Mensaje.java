/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajes;

import java.util.Calendar;

/**
 *
 * @author Soler
 */
        
public abstract class Mensaje {
    
    private Calendar fecha;
    private String texto;
    
    public  Mensaje(Calendar fecha, String texto){
    
    this.fecha=fecha;
    this.texto=texto;
        
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public abstract void getAlgo();

    @Override
    public String toString() {
        return "Mensaje{" + "fecha=" + fecha + ", texto=" + texto + '}';
    }
    
    
}
