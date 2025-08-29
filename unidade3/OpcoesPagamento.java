package unidade3;

import javax.swing.JOptionPane;

public class OpcoesPagamento {

	public static void main(String[] args) {
		
		double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto "));
		double produto_avista = valor_produto * 0.9;
		double produto_parcelado = valor_produto / 3;
		
		JOptionPane.showMessageDialog(null, "O valor do produto a vista é de: R$"+produto_avista+" E o valor do produto parcelado e´de R$:"+produto_parcelado);
		
		
	}

}
