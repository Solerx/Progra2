/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiquitinas.s.a;

/**
 *
 * @author Soler
 */
public class SinFigura extends Lazo implements Discountable{

    public SinFigura(int id, String name, String description, int price) {
        super(id, name, description, price);
    }

    @Override
    public double getDiscount() {
        
        return 0.05;
    }
    
}
