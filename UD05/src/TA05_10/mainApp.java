package TA05_10;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sumaTotal = 0;
		String numVentas = "";
		do {
			numVentas = JOptionPane.showInputDialog("Introduce el numero de ventas");
		} while (numVentas.isEmpty());
		
		for (int i = 1; i <= Integer.parseInt(numVentas); i++) {
			sumaTotal += Double.parseDouble(JOptionPane.showInputDialog("Introduce precio numero "+i));
		}
		JOptionPane.showMessageDialog(null, "El total es: "+sumaTotal);
	}

}
