package Ejercicio2Order;

/**
 * Esta es la clase que representa la calculadora de descuentos, no tiene constructor, solo un método.
 */
public class DiscountCalculator {
	
	/**
	 * Esta función te aplica tu descuento dependiendo de el monto total de el order a.
	 * Va viendo que tipo de descuento tienes con los if, viendo tu tipo de usuario y el monto total.
	 * @param a es el order que le llega por parámetro para ejercer el descuento en él.
	 */
	public void ApplyDiscount(Order a) {
		if(a.totalAmount>1000) {
			a.discount=a.totalAmount*0.2;
		} else if (a.totalAmount>500) {
			if(a.customerType == CustomerType.REGULAR) {
				a.discount = a.totalAmount * 0.1;
			} else if (a.customerType == CustomerType.VIP){
				a.discount = a.totalAmount * 0.15;
			}
		} else if(a.totalAmount>100) {
			if(a.customerType == CustomerType.REGULAR) {
				a.discount = a.totalAmount * 0.05;
			} else {
				a.discount = a.totalAmount * 0.1;
			}
		}
		
	}

}
