package resolutions.excises.lacos;

import java.util.Scanner;

/**
 * Nesta classe será executada as seis formas feitas
 * pelas práticas estrururais de laços que utilizará
 * como exemplo a forma matemática de uso do fatorial.
 */
public class FatorialLoopins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Opções para cada case selecionada;
		System.out.println(" OPÇÕES DE LAÇO PRÉ-TESTE:");
		System.out.println(" DIGITE 1: CASO OPTE COMO FORMA, O LAÇO CONDICIONAL PRÉ-TESTE VERDADEIRO;");
		System.out.println(" DIGITE 2: CASO OPTE COMO FORMA, O LAÇO CONDICIONAL PRÉ-TESTE FALSA;");
		System.out.println("\n\n OPÇÕES DE LAÇO PRÉ-TESTE:");
		System.out.println(" DIGITE 3: CASO OPTE COMO FORMA, O LAÇO CONDICIONAL PÓS-TESTE FALSO;");
		System.out.println(" DIGITE 4: CASO OPTE COMO FORMA, O LAÇO CONDICIONAL PÓS-TESTE VERDADEIRO;");
		System.out.println("\n\n OPÇÃO DE LAÇOS SELEÇÃO:");
		System.out.println(" DIGITE 5: CASO OPTE COMO FORMA, O LAÇO CONDICIONAL POR SELEÇÃO;");
		System.out.println("\n\n OPÇÕES DE LAÇO INCONDICIONAL:");
		System.out.println(" DIGITE 6: CASO OPTE COMO TESTE FORMA, O LAÇO INCONDICIONAL;");
		int options = input.nextInt();
		
		// Inicaializador para todas as condicionais de controle das opções switch...cases;
		int fatorial = 1;
		
		// O contador será um atributo essencial para os loopings a serem executados e os produtos a serem calculados pelo fatorial;
		int contador = 1;
		
		// Estrutura para seleção de casos de opções selecionadas, caso contrário sairá do padrão case e cairá em default;
		switch (options) {
		case 1:
			System.out.printf("%n Sua escolha foi a opção %d;%n", options);
			System.out.println(" A técnica utiliza a forma condicional pré-teste(while).");
			
			// 
			while (contador <= 5) {
				fatorial *= contador;
				System.out.printf(" Fatorial 5! = %d%n", fatorial);
				contador++;
			}
			break;
		case 2:
			System.out.printf("%n Sua escolha foi a opção %d;%n", options);
			System.out.println(" A técnica utiliza a forma condicional pré-teste(while).");
			
			System.out.println(" Neste caso há duas formas de se para a estrutura while:");
			System.out.println(" Digite 1 caso queira testar o laço uma única vez;\n Digite 2 caso queira testar o laço \"n\" vezes;");
			options = input.nextInt();
			
			switch (options) {
			case 1:
				// O caso 1 será executado apenas uma vez, pois o contador ele é menor que 5 e não maior;
				/* E neste exemplo o resultado condicional não chega a ser apresentado pois está a executar uma condição de controle pré teste
				 * e por ela ser falsa ela sai do seu ciclo condicional e não apresenta a saída fatorial;
				 */ 
				while (contador > 5) {
					fatorial *= contador;
					System.out.printf(" Fatorial 5! = %d%n", fatorial);
					contador++;
				}
				break;
			case 2:
				// O caso 2 será executará 5 loops pois a o perador lógico (not = !) soará para condição como se ela fosse verdadeira enquanto na verdade ela é falsa;
				while (!(contador > 5)) {
					fatorial *= contador;
					System.out.printf(" Fatorial 5! = %d%n", fatorial);
					contador++;
				}
				break;
			default:
				System.out.println(" A opção não condiz com as indicadas para a escolha da tomada de decisão.");
				break;
			}
			break;
		case 3:
			System.out.printf("%n Sua escolha foi a opção %d;%n", options);
			System.out.println(" A técnica utiliza a forma condicional pós-teste(do...while).");
			
			do {
				fatorial *= contador;
				System.out.printf(" Fatorial 5! = %d%n", fatorial);
				contador++;
			} while (contador <= 5);
			break;
		case 4:
			System.out.printf("%n Sua escolha foi a opção %d;%n", options);
			System.out.println(" A técnica utiliza a forma condicional pós-teste(do...while).");
			System.out.println("\n Digite 1 caso queira testar o laço uma única vez;\n Digite 2 caso queira testar o laço \"n\" vezes;");
			options = input.nextInt();
			
			switch (options) {
			// O caso 1 será executado apenas uma vez, pois o contador ele é menor que 5 e não maior;
			/*
			 * Como é uma execução de controle condicional pós-teste ela executa o seu bloco antes
			 * da condição então ela mostra o seu resultado antes testar o loop;
			 */
			case 1:
				do {
					fatorial *= contador;
					System.out.printf(" Fatorial 5! = %d%n", fatorial);
					contador++;
				} while (contador > 5);
				break;
			case 2:
				// O caso 2 será executará 5 loops pois a o perador lógico (not = !) soará para condição como se ela fosse verdadeira enquanto na verdade ela é falsa;
				do {
					fatorial *= contador;
					System.out.printf(" Fatorial 5! = %d%n", fatorial);
					contador++;
				} while (!(contador > 5));
				break;
			default:
				break;
			}
			break;
		case 5:
			System.out.printf("%n Sua escolha foi a opção %d;%n", options);
			System.out.println(" A técnica utiliza a forma condicional por seleção(while ou do...while).");
			
			System.out.println("\n Digite 1 ou 2:\n Caso escolha 1 a técnica utilizada será pelo laço while;\n Caso escolha 2 a técnica utilizada será por do...while;");
			int decisao = input.nextInt();
			
			if (decisao == 1) {
				System.out.println("\n Você optou pela opção 1 uso por while;");
				
				while (contador <= 5) {
					fatorial *= contador;
					
					System.out.printf("\n\n Fatorial 5! = %d%n", fatorial);
					if ((fatorial % 2) == 0) {
						System.out.println(" O valor do fatorial é par!!!");
					} else {
						System.out.println(" O valor do fatorial é impar!!!");
					}
					contador++;
				}
			} else if (decisao == 2) {
				System.out.print("\n Você optou pela opção 2 uso por do...while.");
				
				do {
					fatorial *= contador;
					System.out.printf("\n\n Fatorial 5! = %d%n", fatorial);
					
					if ((fatorial % 2) == 0) {
						System.out.println(" O valor do fatorial é par!!!");
					} else {
						System.out.println(" O valor do fatorial é impar!!!");
					}
					contador++;
				} while (contador <= 5);
			} else {
				System.out.println("\n Valor inválido.");
			}
			
			break;
		case 6:
			System.out.printf("%n Sua escolha foi a opção %d;%n", options);
			
			/*
			 * Nesta estrutura for não temo inicializador dentro de seu
			 * parâmetro pois é utilizado a variável global contador pois está fora
			 * da tomada de decisão selecionada mas precisa do ";" antes da condição
			 * pois como é regra do for o prograda dará erro.
			 * 
			 * A estrutura for também em livros mais teórico é visto como estrutura de controle incondicional,
			 * pois ela tem que ter seu padrão para executar o ciclo normalmente
			 */
			for (; contador <= 5; contador++) {
				fatorial *= contador;
				System.out.printf("\n\n Fatorial 5! = %d%n", fatorial);
			}
			break;

		default:
			// Este bloco será acionado e executado caso nenhum dos casos condicionais acima seja atendido;
			System.out.println("\n Você saiu do programa.");
			break;
		}
	}
}
 