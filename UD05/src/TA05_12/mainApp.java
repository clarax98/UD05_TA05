package TA05_12;

import javax.swing.JOptionPane;

public class mainApp {
	public static void main(String[] args) {
		String passwd = "1234";
		int intentos = 3;
		do {
			if(passwd.equals(JOptionPane.showInputDialog("Introduce la contraseña: (Intentos restantes: "+intentos+")"))) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				return;
			}
			intentos--;
		} while (intentos > 0);
		JOptionPane.showMessageDialog(null, "Upsss....");
	}
}
