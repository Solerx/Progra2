/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.persona;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author laboratorio
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Persona persona = new Persona();
//
//        persona.setId(123);
//        persona.setNombre("Don Asdrubal Pachano");
//        persona.setTelefono(8008000);
//        persona.setDireccion("Costa Rica");
//        persona.setFechaNacimiento(Calendar.getInstance());
        Calendar calendar = new GregorianCalendar();
        calendar.set(1986, 11, 23);
        
        Persona persona = new Persona(123,"Don Asdrubal Pachano","Costa Rica",8008000,calendar);
        
        
        
        //System.out.println("La persona es: " + "\nID:" + persona.getId() + "\nNombre:" + persona.getNombre() + "\nTelefono:" + persona.getTelefono() + "\nDireccion:" + persona.getDireccion() + "\nFecha Nacimiento:" + persona.getFechaNacimiento()+ "\nEdad: " + persona.getEdad());
        System.out.println(persona);
     
    }

}
