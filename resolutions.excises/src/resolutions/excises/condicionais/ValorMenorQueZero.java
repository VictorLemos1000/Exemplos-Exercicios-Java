package resolutions.excises.condicionais;

import java.util.Scanner;

public class ValorMenorQueZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira um número inteiro para o teste.");
		int numero = input.nextInt();
		System.out.printf("%n Numero teste: %d", numero);
		
		System.out.println("\n\n Se o número for menor que 0 ele será múltiplicado por -1.");
		if (numero < 0) {
			numero *= -1;
			System.out.printf("%n Número foi multiplicado: %d", numero);
			
		}
	}
}
			
