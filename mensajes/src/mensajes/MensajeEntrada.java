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

public class MensajeEntrada extends Mensaje{
    
    private Contacto remitente;
        
    public MensajeEntrada(Calendar fecha, String texto, Contacto contacto){
           
        super(fecha,texto);
        
        this.remitente = contacto;
        
    }

    public void addDestinatario(Contacto contacto){
    
    
        
    }
    
    
    
    public Contacto getRemitente() {
        return remitente;
    }

    public void setRemitente(Contacto remitente) {
        this.remitente = remitente;
    }

    @Override
    public String toString() {
        return "MensajeEntrada{" + "remitente=" + remitente + '}';
    }
    
    @Override
    public void getAlgo() {
        
        System.out.println("Mensaje de metodo abstracto.");
        
    }
    
}
