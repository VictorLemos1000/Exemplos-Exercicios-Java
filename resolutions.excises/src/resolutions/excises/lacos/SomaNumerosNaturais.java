package resolutions.excises.lacos;

import java.util.Scanner;

public class SomaNumerosNaturais {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);			

		System.out.println(" Insira um número para ser o somador:");
		int somador = input.nextInt();
		for (int numero = 1; numero < 100; numero++) {
			int soma = numero + somador;
			System.out.printf("%n %d + %d = %d", numero, somador, soma);
		}
	}
}
