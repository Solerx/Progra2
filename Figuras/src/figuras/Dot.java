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
public abstract class Dot {
    
    protected int x;
    protected int y;
    
    protected Dot(int x, int y){
    
        this.x=x;
        this.y=y;
                
    }

    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }
   
    protected void move(){
    
        System.out.println("Me estoy moviendo de X:" + x + " a Y:" + y);
    
    }
    
    public abstract void pintar();
    
    public abstract void area();
    
    public abstract void perimetro();
    
    
    
}
