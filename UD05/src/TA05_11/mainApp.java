package TA05_11;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (JOptionPane.showInputDialog("Introduce el numero de dia de la semana")) {
		case "6": 
			JOptionPane.showMessageDialog(null, "Es Festivo");
			break;
			
		case "7": 
			JOptionPane.showMessageDialog(null, "Es Festivo");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Es Laborable");
			
		}
	}

}
