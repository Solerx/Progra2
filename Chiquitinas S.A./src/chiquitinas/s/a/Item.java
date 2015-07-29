/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiquitinas.s.a;

import java.text.DecimalFormat;

/**
 *
 * @author Soler
 */
public class Item {
    
    private int lineNumber;
    private int quantity;
    private Product product;
    private double subTotal;
    
    public Item(int lineNumber, int quantity, Product product){
    
        this.lineNumber=lineNumber;
        this.product=product;
        this.quantity=quantity;
    
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSubTotal() {
        
        this.subTotal = this.quantity * this.getProduct().getPrice() - ((this.quantity * this.getProduct().getPrice()) * getProductDiscount());
        
        
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    
    public double getProductDiscount(){
    
        if (this.product instanceof SinFigura){
        
        return ((SinFigura)this.product).getDiscount();
        
        }else{
        
        return 0.0;
    }
    
    }

    @Override
    public String toString() {
        
        DecimalFormat n = new DecimalFormat("#0");
        
        return lineNumber+ "      " + this.getQuantity() + "       " + product.getName() + "       "+ product.getPrice() + "         " + "%"+ n.format(getProductDiscount()*100) + "         "+getSubTotal() + "\n";
        
    }
    
    
    
    
}
