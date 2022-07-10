package TA05_13;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero1 = "";
		String numero2 = "";
		String signo = "";
		do {
			numero1 = JOptionPane.showInputDialog("Introduce el numero 1: ");
		} while (numero1.isEmpty());
		do {
			numero2 = JOptionPane.showInputDialog("Introduce el numero 2: ");
		} while (numero2.isEmpty());
		do {
			signo = JOptionPane.showInputDialog("Introduce el signo aritmetico: ");
		} while (signo.isEmpty());
		
		double n1 = Double.parseDouble(numero1);
		double n2 = Double.parseDouble(numero2);
		
		switch (signo) {
			case "+": 
				JOptionPane.showMessageDialog(null, n1+n2);
				break;
				
			case "-": 
				JOptionPane.showMessageDialog(null, n1-n2);
				break;
				
			case "*": 
				JOptionPane.showMessageDialog(null, n1*n2);
				break;
				
			case "/": 
				JOptionPane.showMessageDialog(null, n1/n2);
				break;
				
			case "^": 
				JOptionPane.showMessageDialog(null, Math.pow(n1, n2));
				break;
	
			case "%": 
				JOptionPane.showMessageDialog(null, n1%n2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Signo aritmetico no valido");
		}
	}

}
