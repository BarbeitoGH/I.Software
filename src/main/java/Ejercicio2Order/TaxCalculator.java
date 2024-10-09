package Ejercicio2Order;

public class TaxCalculator {
	
	/**
	 * El método te calcula tus impuestos cogiendo el monto total del order del parámetro y multiplicandolo por 0.15.
	 * Luego le aplica el el impuesto al order a.
	 * @param a es el order que recibe para trabajar con él y calcular sus impuestos
	 */
	public void CalculateTax (Order a) {
		a.tax = a.totalAmount * 0.15;
	}

}
