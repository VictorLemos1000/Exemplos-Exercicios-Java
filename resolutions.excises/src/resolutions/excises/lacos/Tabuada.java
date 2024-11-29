package resolutions.excises.lacos;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Elaborar um programa que mostre os resultados da tabuada de um número qualquer,
 * a qual deve ser apresentada de acordo com sua forma tradicional.
 */
public class Tabuada {
	Scanner entrada = new Scanner(System.in);

	// atributo de classe pois possui a palavra static
	private static int CONTADOR;
	// Atributos de cada operação
	private int soma;
	private int subtraido;
	private int produto; // Produto é o resultado da multiplicação;
	private int quociente; // Quociente é o resultado da divisão;
	
	// Atributo criadado caso o usuário queira realizar uma nova operação de seleção para o método associado;
	private boolean continuidade;
	
	
	// Método construtor da classe;
	public Tabuada(int soma, int subtraido, int produto, int quociente) {
		this.soma = soma;
		this.subtraido = subtraido;
		this.produto = produto;
		this.quociente = quociente;
	}
	
	// O método ele fará a operação matmática da adição;
	public void adicao(int operando) {
		
		System.out.printf("\n Acione um número de 0 a 10");		
		for (CONTADOR = entrada.nextInt(); CONTADOR <= 10; CONTADOR++) {
			
			
			
			switch (CONTADOR) {
			/*
			 * Cada case fará os seguintes passos,
			 * enquanto o número operando for menor ou igual ao limite estabelecido
			 * fará a seguinte o operando ele vai atribuir a
			 * soma do número operando atual com o contador selecionado pela case;
			 * depois no próximo passo a variável soma recerá
			 * o resultado da soma com o atual número operando adicionado com a contante do bloco case
			 * com que no caso é o contador que no caso é o protagonista global por ser o atributo de classe.
			 */
			case 1:
				while (operando <= 10) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 2:
				while (operando <= 20) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 3:
				while (operando <= 30) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 4:
				while (operando <= 40) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 5:				
				while (operando <= 50) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);		
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 6:
				while (operando <= 60) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 7:
				while (operando <= 11) {
					
					operando += CONTADOR;
					soma = operando + 7;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);				
				break;
				
			case 8:
				while (operando <= 80) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
			
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 9:
				while (operando <= 90) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			case 10:
				while (operando <= 100) {
						
					operando += CONTADOR;
					soma = operando + CONTADOR;
					System.out.printf("%n %d + %d = %d%n", operando, CONTADOR, soma);
				}
				System.out.printf("%n Termino da tabuada da adição %d", CONTADOR);
				break;
				
			default:
				System.out.println("\n Opção não ofertada.");
				break;
				
				
		}// termino da estrurura switch...case;
			
			
		}
	}// Termino do método da adição;


	
	
}