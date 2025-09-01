package unidade3;

import javax.swing.JOptionPane;

public class LanHouse {

	public static void main(String[] args) {
		
		final int VALOR_POR_15MINUTOS = 2;
		double horas, minutos, total_minutos;
		double total_a_pagar;
		
		horas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas utilizadas: "));
		minutos = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de minutos utilizados: "));
		
		total_minutos = horas*60 + minutos;
		total_a_pagar = Math.ceil((total_minutos/15))*VALOR_POR_15MINUTOS;
		
		JOptionPane.showMessageDialog(null, "O valor a pagar é de R$ "+total_a_pagar);
	}

}
