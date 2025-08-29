package unidade3;

import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt((JOptionPane.showInputDialog("informe o numero ")));
		int antecessor = numero -1;
		int posterior = numero +1;
		JOptionPane.showMessageDialog(null, "O numero antecessor é "+antecessor+" O numero posterior é "+posterior);
		
		
	}

}
