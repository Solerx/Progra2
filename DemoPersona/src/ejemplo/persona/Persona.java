/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.persona;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {

    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private Calendar fechaNacimiento;

    public Persona() {

    }

    public Persona(int id, String nombre, String direccion, int telefono, Calendar fechaNacimiento) {

        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        
    }

    public void setId(int id) {

        this.id = id;

    }

    public int getId() {

        return this.id;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getNombre() {

        return this.nombre;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public String getDireccion() {

        return this.direccion;

    }

    public void setTelefono(int telefono) {

        this.telefono = telefono;

    }

    public int getTelefono() {

        return this.telefono;

    }
    
   
    public int getEdad() {
        int añoNacimiento = 0;
        int añoActual = 0;
        int edad = 0;
        
        añoNacimiento = fechaNacimiento.get(Calendar.YEAR);
        añoActual = Calendar.getInstance().get(Calendar.YEAR);
        edad = añoActual - añoNacimiento;
        
        return edad;

    }

    public void setFechaNacimiento(Calendar fecha) {

        this.fechaNacimiento = fecha;
                
    }

    public Calendar getFechaNacimiento() {

        return this.fechaNacimiento;

    }

    @Override
    public String toString() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        
        String retorno = "";
        
        retorno += "ID:" + getId() + "\nNombre:" + getNombre() + "\nTelefono:" + getTelefono() + "\nDireccion:" + getDireccion() + "\nFecha Nacimiento:" + sdf.format(fechaNacimiento.getTime()) + "\nEdad: " + getEdad();
        
        
        return retorno;
    }

}
