package resolutions.excises.condicionais;

import java.util.Scanner;

public class MediaAritmetica_NotaExtra {

	public static void main(String[] args) {
		Scanner inserirDados = new Scanner(System.in);
		
		System.out.println(" Insira a primeira nota:");
		float nota1 = inserirDados.nextFloat();
		System.out.printf("%n Nota da 1ª unidade: %.1f;", nota1);
		
		System.out.println("\n Insira a segunda nota:");
		float nota2 = inserirDados.nextFloat();
		System.out.printf("%n Nota da 2ª unidade: %.1f;", nota2);
		
		System.out.println("\n Insira a terceira nota:");
		float nota3 = inserirDados.nextFloat();
		System.out.printf("%n Nota da 3ª unidade: %.1f;", nota3);
		
		System.out.println("\n Insira a quarta nota:");
		float nota4 = inserirDados.nextFloat();
		System.out.printf("%n Nota da 4ª unidade: %.1f;", nota4);
		

		System.out.println("\n ------------------------------------------");
		float mediaAritmetica1 = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// Nota de exame e 2ª média necessária, caso a média 1 não alcance nota 7,0
		System.out.println("\n\n Insira sua nota extra de exame:");
		float notaExame = inserirDados.nextFloat();
		float mediaAritimetica2 = (mediaAritmetica1 + notaExame) / 2;
		
		if (mediaAritmetica1 >= 7.0f) {			
			System.out.println("\n Você foi aprovado com sucesso!!!");
			System.out.printf("%n Sua 1ª média foi %.1f;", mediaAritmetica1);
		} else if (mediaAritimetica2 >= 5.0f) {
			System.out.println("\n Você foi aprovado pela nota de exame.");
			System.out.printf("%n Sua nota do exame foi %.1f.", mediaAritimetica2);
		} else {
			System.out.println("\n Você foi reprovado de forma geral, infelizmente.");
			System.out.printf("%n Sua 1ª média foi %.1f;", mediaAritmetica1);
			System.out.printf("%n Sua nota do exame foi %.1f.", mediaAritimetica2);
		}
	}
}
