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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dot figure = new Circle(45, 67);
        //Works with all the figures triangle, circle and square.
        
        figure.move();
        figure.pintar();
        figure.area();
        figure.perimetro();
        
    }
    
}
