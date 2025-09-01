package unidade3;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		final double numero_avaliacoes = 4; //CONSTANTE
		double nota1, nota2, nota3, nota4;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar a nota 1: ");
		nota1 = teclado.nextDouble();
		
		System.out.println("Favor informar a nota 2: ");
		nota2 = teclado.nextDouble();
		
		System.out.println("Favor informar a nota 3: ");
		nota3 = teclado.nextDouble();
		
		System.out.println("Favor informar a nota 4: ");
		nota4 = teclado.nextDouble();
		
		media = (nota1+nota2+nota3+nota4) /numero_avaliacoes;
		
		/*if (media <5) //V ou F
			System.out.println("Aluno - REPROVADO");
		*/
		System.out.println("A média aritimetica é: "+media);

		if (media <5) //V ou F
			System.out.println("Aluno - REPROVADO");
		
	}

}
