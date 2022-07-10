package TA05_05;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "";
		do {
			r = JOptionPane.showInputDialog("Introduce el numero");
		} while (r.isEmpty());
		if((Double.parseDouble(r) % 2) == 0) {
			JOptionPane.showMessageDialog(null, "Divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, "No divisible entre 2");
		}
	}
	
}
	
