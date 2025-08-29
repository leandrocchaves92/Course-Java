package unidade3;

import javax.swing.JOptionPane;

public class JantarPizza {

	public static void main(String[] args) {
		
		double valor_jantar = Double.parseDouble((JOptionPane.showInputDialog("informe o valor do jantar")));
		int numero_clientes = Integer.parseInt((JOptionPane.showInputDialog("informe o numero de horas de viagem")));
		double valor_jantar_total = valor_jantar/numero_clientes;
		JOptionPane.showMessageDialog(null, "O valor do jantar a ser pago é de "+ valor_jantar_total+" para cada cliente");

	}

}
