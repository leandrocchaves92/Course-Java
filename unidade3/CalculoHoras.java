package unidade3;

import javax.swing.JOptionPane;

public class CalculoHoras {

	public static void main(String[] args) {
		
		int dias = Integer.parseInt((JOptionPane.showInputDialog("informe o numero de dias de viagem")));
		int horas = Integer.parseInt((JOptionPane.showInputDialog("informe o numero de horas de viagem")));
		int total_horas = (dias*24) + horas;
		
		JOptionPane.showMessageDialog(null, "O valor total da viagem em horas foi de "+total_horas);
		
		
	}

}
