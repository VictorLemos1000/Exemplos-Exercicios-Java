package resolutions.excises.condicionais;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Insira um valor inteiro para a variável A:");
		float a = entrada.nextFloat();
		System.out.printf("%n A = %.1f", a);
		
		System.out.println("\n Insira um valor inteiro para a variável B:");
		float b = entrada.nextFloat();
		System.out.printf("%n B = %.1f", b);
		
		System.out.println("\n Insira um valor inteiro para a variável C:");
		float c = entrada.nextFloat();
		System.out.printf("%n C = %.1f", c);
		
		float delta = (float)Math.pow(b, 2) - (4 * a * c);
		
		float raizDelta = (float)Math.sqrt(delta);
		
		if (delta < 0) {
			System.out.println("\n Não há uma soluão real.");
			System.out.printf(" Delta = %.1f", delta);
		} else if (delta > 0) {
			System.out.println("\n Há duas soluções reais.");
			float x1 = (- b + raizDelta) / (2 * a);
			System.out.printf("\n X1 = %.1f", x1);
			
			float x2 = (- b - raizDelta) / (2 * a);
			System.out.printf("\n X2 = %.1f", x2);
		} else if (delta == 0) {
			System.out.println("\n Há uma solução real");
			System.out.printf(" Raíz de delta: %.1f", raizDelta);
		}
	}
}
