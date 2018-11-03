import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class AdivinheQualNumeroEh {
	float valor, qntTentativa;
	
	public AdivinheQualNumeroEh (int valor, int tentativa) {
		// instância um objeto da classe Random usando o construtor padrão
		Random gerador = new Random();

		// gera um valor aleatório entre 0 e 50
		int numRandom = gerador.nextInt(51);

		//System.out.println(valor);
		//System.out.println(numRandom);
		//System.out.println(tentativa);

		for (int i = 1; i <= tentativa; i++) {
			if(numRandom == valor) {
				// limpar tela
				System.out.print("\033[H\033[2J");
				System.out.flush();
				
				System.out.println("Boaaa, você acertou qual era o número!");
				System.out.println("Número sorteado: " + numRandom);
				System.out.println("Seu número: " + valor);
				break;
			}
			else if ((tentativa != 1) && (i !=  3)) {
				// limpar tela
				System.out.print("\033[H\033[2J");
				System.out.flush();
				
				System.out.println("Errrrroooou, tente novamente! Tu tens mais " + (tentativa - 1) + " chance(s).");
				System.out.println("Número sorteado: " + numRandom);
				System.out.println("Seu número: " + valor);	
				tentativa--;
				play(tentativa);
				break;
			} 
			else if(tentativa == 1) { 
			// limpar tela
			System.out.print("\033[H\033[2J");
			System.out.flush();
			
			int escolha = JOptionPane.showConfirmDialog(null, 
				"Número sorteado: "+ numRandom +"\nSeu número: " + valor + 
				 "\n\nAcabaram suas tentativas! Quer iniciar um novo jogo?",
				"FIM DE JOGO", JOptionPane.YES_NO_OPTION);

			if(escolha == JOptionPane.YES_OPTION) {
				break;
			} else {
				System.exit(0);
			}

			}
		}
		
	}

	private static void menu() {
		System.out
						.println("\n\n          ### GAME - Adivinhe qual é o número ###");
				System.out.println("\n                  =========================");
				System.out.println("                  |     1 - Jogar         |");
				System.out.println("                  |     0 - Sair          |");
				System.out.println("                  =========================\n");
				System.out.println("Opção -> ");
				System.out.print("\n");
	}

	public static void play(int tentativa) {
		int numero;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\nInforme um número entre 0 e 50: ");
		numero = entrada.nextInt();

		System.out.println("tentativa: "+ tentativa);

		AdivinheQualNumeroEh jogo = new AdivinheQualNumeroEh(numero, tentativa);
			
	}	

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		do {
			menu();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				JOptionPane.showMessageDialog(null, "Que comecem os jogos! Você tem apenas 3 chances para acertar o número.");
				play(3);
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			} 
		} while (opcao != 0);
	}
}