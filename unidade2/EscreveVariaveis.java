package unidade3;

import javax.swing.JOptionPane;

public class EscreveVariaveis {

	public static void main(String[] args) {
		/*
		String fruta = "Banana";
		double valor =3.50;
		System.out.println("O valor da "+fruta+" é de "+valor);
		A partir do java10 não precisa especificar o tipo da variavél 
		apena ssubstituir por "var"
		Exemplo:
		var fruta = "Banana";
		var valor =3.50;
		*/
		
		double valor = 3.50;
		String fruta = JOptionPane.showInputDialog("Digite a fruta");
		JOptionPane.showMessageDialog(null, "O valor da "+fruta+" é de "+valor);
	}

}
