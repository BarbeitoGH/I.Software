package Ejercicio2Order;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {
	DiscountCalculator calculator;

		@BeforeEach
		void setup () {
			calculator = new DiscountCalculator();
		}

	@Test
	@DisplayName("Debería calcular el descuento del pedido")
	void CalcularDescuento() {
		List<String> items = new ArrayList<>();
		Order order = new Order("Alice", CustomerType.VIP , items, 700);
		calculator.ApplyDiscount(order);
		double num = 700*0.15;
		double discout = order.discount;
		assertEquals(num,order.discount,"Debería calcular el descuento correcto");
		
	}

}
