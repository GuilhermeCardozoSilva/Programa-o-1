package ClasseAbstrata_Exerc06;

import ClasseAbstrata_Exerc05.*;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Area testeArray = new Area();
		
		// calcular área de 4 retângulos
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o comprimento e largura para calcular a área do  "
					+ (i + 1) + " retângulo");
			double valorComprim = scanner.nextDouble();
			double valorLarg = scanner.nextDouble();
			System.out.println("Área do retângulo " + (i + 1) + " => " + testeArray.
					RectangleArea(valorComprim, valorLarg));
		}
		
		// calcular área de 4 quadrados
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o lado para calcular a área do  "
					+ (i + 1) + " quadrado");
			double valorLado = scanner.nextDouble();
			System.out.println("Área do quadrado " + (i + 1) + " => " + testeArray.
					SquareArea(valorLado));
		}
		
		// calcular área de 5 círculos
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o raio para calcular a área do  "
					+ (i + 1) + " círculos");
			double valorRaio = scanner.nextDouble();
			System.out.println("Área do círculo " + (i + 1) + " => " + testeArray.
					CircleArea(valorRaio));
		}
	}

}
