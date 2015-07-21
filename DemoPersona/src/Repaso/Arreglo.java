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
public class Arreglo {

    private int arreglo[] = new int[10];

    public Arreglo() {

    }

    public Arreglo(int[] arreglo) {

        this.arreglo = arreglo;

    }

    public void setArreglo(int[] arreglo) {

        this.arreglo = arreglo;

    }

    public int[] getArreglo() {

        return this.arreglo;
    }

    public void getMayor(int[] arr) {

        int mayor = 0;
        int menor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mayor: " + mayor + " Arreglo: " + arr[i]);
            if (arr[i] > mayor) {
                mayor = arr[i];
            } else {
                if (arr[i] < menor) {
                    menor = arr[i];
                }
            }
        }
        System.out.println("El mayor es:" + mayor);
        System.out.println("El menor es:" + menor);
    }

    public void getMenor(int[] arr) {

        int menor = 0;

        for (int i = 0; i < this.arreglo.length; i++) {

            if (arr[i] < menor) {

                menor = arr[i];

            }

        }

        System.out.println("" + menor);
    }

    public void getPromedio(int[] arr) {

        int sumatoria = 0;

        for (int i = 0; i < arr.length; i++) {

            sumatoria += arr[i];

        }

        System.out.println("El promedio es: " + (sumatoria / arr.length));
    }
}
