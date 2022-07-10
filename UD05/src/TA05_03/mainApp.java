package TA05_03;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		do {
			name = JOptionPane.showInputDialog("Introduce tu nombre");
		} while (name.isEmpty());
		JOptionPane.showMessageDialog(null, "Bienvenidx "+name);
	}

}
