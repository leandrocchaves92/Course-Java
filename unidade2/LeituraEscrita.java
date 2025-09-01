package unidade3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraEscrita {

	public static void main(String[] args) {
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = teclado.next();
		System.out.println("Seja Bem vindo "+nome);
		*/
		
		var nome = JOptionPane.showInputDialog("Digite o seu nome");
		JOptionPane.showMessageDialog(null, "Seja bem-vindo "+nome);
		
		
	}

}
