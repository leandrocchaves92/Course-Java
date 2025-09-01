package unidade3;

import javax.swing.JOptionPane;

public class OpcoesPagamento {

	public static void main(String[] args) {
		
		double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto "));
		double produto_avista = valor_produto * 0.9;
		double produto_parcelado = valor_produto / 3;
		
		//JOptionPane.showMessageDialog(null, "O valor do produto a vista é de: R$"+produto_avista+" E o valor do produto parcelado e´de R$:"+produto_parcelado);
		
		System.out.println("O produto pago a vista tem 10% de desconto e sairá por: R$ "+produto_avista);
		System.out.println("O produto pago a prazo em 3x de R$ "+produto_parcelado);
		
	}

}
