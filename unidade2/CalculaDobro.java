package unidade3;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaDobro {

	public static void main(String[] args) {
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero ");
		double numero = teclado.nextDouble();
		double dobro = numero * 2;
		System.out.println("O dobro do numero é "+dobro);
		*/
		var numero = JOptionPane.showInputDialog("Digite o numero");
		var dobro = Double.parseDouble(numero)*2;
		
		JOptionPane.showMessageDialog(null, "O dobro de seu numero é "+numero);
		
	}

}
