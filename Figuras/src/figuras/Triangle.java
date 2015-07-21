/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Soler
 */
public class Triangle extends Dot {

    public Triangle(int x, int y) {

        super(x, y);

    }

    @Override
    public void pintar() {
        System.out.println("Me pinto Triangulo");
    }

    @Override
    public void area() {   
        System.out.println("Area");   
    }

    @Override
    public void perimetro() {       
        System.out.println("Perimetro");       
    }

}
