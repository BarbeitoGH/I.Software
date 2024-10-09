package Ejercicio2Order;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        DiscountCalculator calculatordisc = new DiscountCalculator();
        TaxCalculator calculatortax = new TaxCalculator();
        items.add("Item1");
        items.add("Item2");

        Order order = new Order("Alice", CustomerType.VIP , items, 1200);
        calculatordisc.ApplyDiscount(order);
        calculatortax.CalculateTax(order);
        order.printOrderDetails();
    }
}
