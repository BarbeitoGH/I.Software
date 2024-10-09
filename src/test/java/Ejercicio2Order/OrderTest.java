package Ejercicio2Order;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderTest {
	Order order;
	List<String> items = new ArrayList<>();
	DiscountCalculator calculator1 = new DiscountCalculator();
	TaxCalculator calculator2 = new TaxCalculator();
	@BeforeEach
	void setup() {
		order = new Order("Alice", CustomerType.VIP , items, 700);
	}
	

	@Test
	@DisplayName("Debería de calcular el monto total y sacar los valores")
	void OrderMontoTotal() {
		calculator1.ApplyDiscount(order);
		calculator2.CalculateTax(order);
		
		order.printOrderDetails();
		double n = 700;
		
		assertEquals(n,order.totalAmount,"Debería hacer la cuenta completa bien, añadiendo taxes y quitando descuento");
		
	}

}
