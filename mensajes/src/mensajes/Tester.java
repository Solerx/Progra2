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

public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contacto contacto = new Contacto(123,"Juan Mata");
        Mensaje me = new MensajeEntrada(Calendar.getInstance(),"Hola",contacto);
        
        me.getAlgo();
        
    }
    
}
