package TA05_04;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "";
		do {
			r = JOptionPane.showInputDialog("Introduce el radio del circulo");
		} while (r.isEmpty());
		JOptionPane.showMessageDialog(null, "Area: "+String.format("%,.2f",calculoAreaCirculo(Double.parseDouble(r))));
	}
	
	//Metodo que calcula el area del circulo
	public static double calculoAreaCirculo(double r) {
		return (Math.PI * Math.pow(r, 2));
	}
	
}
