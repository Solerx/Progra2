/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiquitinas.s.a;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Soler
 */
public class Order {

    int id;
    Calendar timeStamp;
    Client client;
    double totalAmount;
    String notes;
    ArrayList<Item> listOfItems = new ArrayList<Item>();
    double tax;

    public Order(int id, Calendar timeStamp, Client client, int totalAmount, String notes, ArrayList<Item> listOfItems, int tax) {

        this.id = id;
        this.timeStamp = timeStamp;
        this.client = client;
        this.totalAmount = totalAmount;
        this.notes = notes;
        this.listOfItems = listOfItems;

    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getTimeStamp() {

        return timeStamp;
    }

    public void setTimeStamp(Calendar timeStamp) {
        
        this.timeStamp = timeStamp;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalAmount() {
        
        
        
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void addItem(Item item) {

        this.listOfItems.add(item);

    }

    public String printItems() {

        String returnable = "";
        for (Item i : listOfItems) {
            returnable += i.toString();
            totalAmount = totalAmount + i.getSubTotal();
        }
        return returnable;
    }

    @Override
    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
        DecimalFormat n = new DecimalFormat("#0.00");
      
        StringBuffer sb = new StringBuffer();
        sb.append("Chiquitinas S.A." + "             Orden #: " + this.getId() + "\n");
        sb.append("Nombre: " + this.getClient().getName() + "         Telefono: " + this.getClient().getPhone() + "\n");
        sb.append("Dirección: " + this.getClient().getDirection() + "          Fecha: " + sdf.format(this.getTimeStamp().getTime()) + "\n");
        sb.append("Responsable: " + this.getClient().getResponsible(client) + "\n");
        sb.append("------------------------------------------------------------------------ \n");
        sb.append("--- Cantidad --- Producto ----- Precio ---- Descuento --- Subtotal ----- \n");
        sb.append("----------------------------------------------------------------------- \n");
        sb.append(this.printItems());
        sb.append("----------------------------------------------------------------------- \n");
        sb.append("----------------------------------------------------------- IVA: %" + n.format(getTax()*100) + "\n");
        sb.append("--------------------------------------------------------- Total: " + n.format(getTotalAmount() + (getTotalAmount() * getTax()))+ "\n");
       
        return sb.toString();
    }

}
