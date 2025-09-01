package unidade3;

import javax.swing.JOptionPane;

public class RevendaVeiculos {

	public static void main(String[] args) {
		
		var modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro: "));
		double entrada = 0.5* valor;
		double restante = (0.5* valor)/12; 
		System.out.println("O valor do carro com 50% de entrada é de: R$ "+entrada+" com o saldo restante em 12 parcelas de: R$  "+restante);
	}

}
