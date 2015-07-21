/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo arreglo = new Arreglo();
        
        arreglo.setArreglo(llenarArreglo());
        
        arreglo.getPromedio(arreglo.getArreglo());
        arreglo.getMayor(arreglo.getArreglo());
        arreglo.getMenor(arreglo.getArreglo());
        
    }
    
     public static int [] llenarArreglo() {

        int[] arreglo = new int[10];

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero."));

        }
        
        return arreglo;
    }

}
