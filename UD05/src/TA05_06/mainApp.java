package TA05_06;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String precio = "";
		final double IVA = 1.21;
		
		do {
			precio = JOptionPane.showInputDialog("Introduce el precio sin IVA");
		} while (precio.isEmpty());
	
		JOptionPane.showMessageDialog(null, "El precio con el IVA es: " + Double.parseDouble(precio) * IVA);
		
	}

}
