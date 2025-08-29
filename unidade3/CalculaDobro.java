package unidade3;

import java.util.Scanner;

public class CalculaDobro {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero ");
		double numero = teclado.nextDouble();
		double dobro = numero * 2;
		System.out.println("O dobro do numero é "+dobro);
		
	}

}
