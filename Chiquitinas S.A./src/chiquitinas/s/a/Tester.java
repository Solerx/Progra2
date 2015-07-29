/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiquitinas.s.a;

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

      Client c = new Legal(123,"Empresa S.A.","San Jose",8008000, "Juan Soto");
      Order order = new Order();
      order.setTax(0.13);
      order.setId(123);
      order.setClient(c);
      order.setTimeStamp(Calendar.getInstance());
      Product lazo = new Lazo(001,"Lazo Grande","10cm Azul", 300);
      Product lazoSin = new SinFigura(001,"Lazo Grande","10cm Azul", 600);
      Item i = new Item(1,3,lazo);
      Item j = new Item(2,2,lazoSin);
      order.addItem(i);
      order.addItem(j);
      order.addItem(i);
      order.addItem(j);
      order.addItem(i);
      order.addItem(j);
      
      

        System.out.println(order);
    }

}
