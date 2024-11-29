package resolutions.excises.lacos;

import java.util.Scanner;

/**
 * Elaborar um programa que apresente como resultado os quadrados dos números inteiros
 * existentes na faixa de valores de 15 a 200.
 */
public class QuadradoDosNumerosInteiros {

	public static void main(String[] args) {
		
		int base = 15;
		
		/*
		 * O programa está feito da seguinte forma, enquanto a base estiver entre
		 * os intervalos de 15 a 200, o programa ele executará a potencia base ao quadrado
		 * e mostrará o seu resultado e equanto o a base nã chegar até 200 será incrementado
		 * no fim do bloco e sempre dará um resultado diferente a cada iteração
		 */
		/*
		 * O operador lógico da conjunção(&&) ele fará o seguinte passo
		 * enquanto a (condição 1) e (condição 2) continuarem sendo verdadeiras ele sempre
		 * fará uma nova iteração, até que a (condição 2), que é o limite da condicional de controle
		 * chegar num resultado booleano falso não fará o próximo loop e encerrará seu ciclo condicional.
		 */
		while ((base >= 15) && (base <= 200)) {
			System.out.printf("%n%n Base: %d", base);
			int quadrado = (int)Math.pow(base, 2);
			
			System.out.printf("%n Resultado: %d;", quadrado);
			base++;
		}
	}
}
