package resolutions.excises.condicionais;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Scanner entradaNotas = new Scanner(System.in);
		
		System.out.println(" Insira a primeira nota:");
		float nota1 = entradaNotas.nextFloat();
		System.out.printf("%n Nota da 1ª unidade: %.1f", nota1);
		
		System.out.println("\n Insira a segunda nota:");
		float nota2 = entradaNotas.nextFloat();
		System.out.printf("%n Nota da 2ª unidade: %.1f", nota2);
		
		System.out.println("\n Insira a terceira nota:");
		float nota3 = entradaNotas.nextFloat();
		System.out.printf("%n Nota da 3ª unidade: %.1f", nota3);
		
		System.out.println("\n Insira a quarta nota:");
		float nota4 = entradaNotas.nextFloat();
		System.out.printf("%n Nota da 4ª unidade: %.1f", nota4);
		
		float mediaAritimetica = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("%n%n Sua média aritmética foi %.1f", mediaAritimetica);
		
		if (mediaAritimetica > 5.0) {
			System.out.println("\n Aprovado.");
		} else {
			System.out.println("\n Reprovado.");
		}
	}
}
