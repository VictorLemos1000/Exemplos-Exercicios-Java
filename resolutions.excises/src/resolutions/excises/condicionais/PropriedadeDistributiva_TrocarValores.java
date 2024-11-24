package resolutions.excises.condicionais;

import java.util.Scanner;

public class PropriedadeDistributiva_TrocarValores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Insira um valor inteiro para a variável A:");
		int a = entrada.nextInt();
		System.out.printf("%n A = %d", a);
		
		System.out.println("\n Insira um valor inteiro para a variável B:");
		int b = entrada.nextInt();
		System.out.printf("%n B = %d", b);
		
		System.out.println("\n Insira um valor inteiro para a variável C:");
		int c = entrada.nextInt();
		System.out.printf("%n C = %d", c);
		
		if (a > b) {
			System.out.printf("%n %d > %d", a, b);
			c = a;
			a = b;
			b = c;
			System.out.printf("%n Ordem crescente da troca de valores: %d, %d e %d", a, b, c);
		} else if (a > c) {
			System.out.printf("%n %d > %d", a, c);		
			int troca2 = a;
			a = c;
			c = troca2;
			System.out.printf("%n Ordem crescente da troca de valores: %d, %d e %d", a, b, c);
		} else if (b > c) {
			System.out.printf("%n %d > %d", b, c);
			int troca3 = b;
			b = c;
			c = troca3;
			System.out.printf("%n Ordem crescente da troca de valores: %d, %d e %d", a, b, c);
		} else {
			System.out.println("\n Alternativas não correspondentes se todosos valores foram iguais.");
			
			int contador = -1;
			
			while ( !(contador >= 5) ) {
				System.out.printf(" %d", ++contador);
			}
		}
	}
}
