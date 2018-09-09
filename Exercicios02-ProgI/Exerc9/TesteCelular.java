import java.util.Scanner;

public class TesteCelular {
	
	public static void menu() {
		System.out.println("\n\n\tEscolha a operação");
		System.out.println("1. Discar");
		System.out.println("2. Desligar");
		System.out.println("0. Sair");
		System.out.println("Opcao:");
	}
	
	public static void main(String[] args) {
		
		int opcao, i, numero;
		byte ddd;
			
		Scanner entrada = new Scanner(System.in);
		Scanner pegarDdd = new Scanner(System.in);
		Scanner pegarNumero = new Scanner(System.in);
			
		// instanciando  a classe Celular
		Celular iPhoneX = new Celular();
		Celular Zenfone5 = new Celular();
		
		do {
			menu();
			opcao = entrada.nextInt();

			switch(opcao) {
				case 1:
					for(i = 0; i < 300; i++) {
						System.out.print("\r\n");
					}
					System.out.println("Digite o ddd: ");
					ddd = pegarDdd.nextByte();
					System.out.println("Digite o número: ");
					numero = pegarNumero.nextInt();
					iPhoneX.emLigacao = false;
					iPhoneX.discar(ddd, numero);
					break;
				case 2:
					iPhoneX.emLigacao = true;
					iPhoneX.desligar();
					break;
				default:
					System.out.println("Opção inválida.");
			}
		} while(opcao != 0);
	}		
}

