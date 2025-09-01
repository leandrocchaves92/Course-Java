package unidade3;

import java.util.Scanner;

public class NumeroDivisivel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o numero: ");
		int numero = teclado.nextInt();
		
		if (numero%2 == 0) // V ==> o numero é par 
			System.out.println("O numero é par: ");

	}

}
