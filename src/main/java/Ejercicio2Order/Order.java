package Ejercicio2Order;

import java.util.List;
import java.util.ArrayList;

public class Order {
    public String customerName;
    public CustomerType customerType;
    public List<String> items;
    public double totalAmount;
    public double discount;
    public double tax;
    
    
    /**
     * public constructor of order
     * @param customerName es el nombre del usuario.
     * @param customerType es su tipo de usuario.
     * @param items la lista personal de cosas del usuario.
     * @param totalAmount es el monto total del usuario.
     */

    public Order(String customerName, CustomerType customerType, List<String> items, double totalAmount) {
        this.customerName = customerName;
        this.customerType = customerType;
        this.items = items;
        this.totalAmount = totalAmount;
        this.discount = 0;
        this.tax = 0;
    }
    
    /**
     * Te calcula el monto total quitando el descuento y añadiendo los impuestos del order.
     * Luego te saca por consola los valores del order como si fuese una lista.
     */

    public String printOrderDetails() {
    	String pedido = "";
        double finalAmount = this.totalAmount - this.discount + this.tax;
        System.out.println("Customer: " + this.customerName);
        pedido=pedido+this.customerName;
        System.out.println("Customer Type: " + this.customerType);
        pedido=pedido+this.customerType;
        System.out.println("Items: " + String.join(", ", this.items));
        pedido=pedido+this.items;
        System.out.println("Total Amount: " + this.totalAmount);
        pedido=pedido+this.totalAmount;
        System.out.println("Discount: " + this.discount);
        pedido=pedido+this.discount;
        System.out.println("Tax: " + this.tax);
        pedido=pedido+this.tax;
        System.out.println("Final Amount: " + finalAmount);
        this.totalAmount=finalAmount;
        pedido=pedido+this.totalAmount;
        return pedido;
        
    }

}
