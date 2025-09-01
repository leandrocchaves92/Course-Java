package unidade3;

import javax.swing.JOptionPane;

public class Jantar {

	public static void main(String[] args) {

		final double taxa_garcom = 0.1; //CONSTANTE
		double valor_jantar, valor_jantar_total; //VARIAVEL
		
		 valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do jantar"));
		 valor_jantar_total = valor_jantar + (taxa_garcom*valor_jantar);
		 JOptionPane.showMessageDialog(null, "O valor total a ser pago pelo jantar é de : " +valor_jantar_total);
		
	}

}
