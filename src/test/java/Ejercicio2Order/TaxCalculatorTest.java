package Ejercicio2Order;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import insw.Buscador;

class TaxCalculatorTest {
	TaxCalculator calculator;
	@BeforeEach
	void setup() {
		 calculator = new TaxCalculator();
	}
	
	

	@Test
	@DisplayName("Debería calcular los impuestos")
	void CalcularImpuestos() {
		List<String> items = new ArrayList<>();
		Order order = new Order("Alice", CustomerType.VIP , items, 1200);
		double num = 1200*0.15;
		calculator.CalculateTax(order);
		
		assertEquals(num,order.tax,"Debería concordar con el resultado");
		
	}

}
