package resolutions.excises.condicionais;

import java.util.Scanner;

public class DiferencaEntreMaiorMenosValor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Insira um valor inteiro para a variável A:");
		int a = entrada.nextInt();
		System.out.printf("%n A = %d", a);
		
		System.out.println("\n Insira um valor inteiro para a variável B:");
		int b = entrada.nextInt();
		System.out.printf("%n B = %d", b);
		
		if (a > b) {
			System.out.printf("%n%n %d é maior que %d.", a, b);
		}
	}
}
