package ClasseAbstrata_Exerc06;

import ClasseAbstrata_Exerc05.*;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Area testeArray = new Area();
		
		// calcular �rea de 4 ret�ngulos
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o comprimento e largura para calcular a �rea do  "
					+ (i + 1) + " ret�ngulo");
			double valorComprim = scanner.nextDouble();
			double valorLarg = scanner.nextDouble();
			System.out.println("�rea do ret�ngulo " + (i + 1) + " => " + testeArray.
					RectangleArea(valorComprim, valorLarg));
		}
		
		// calcular �rea de 4 quadrados
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o lado para calcular a �rea do  "
					+ (i + 1) + " quadrado");
			double valorLado = scanner.nextDouble();
			System.out.println("�rea do quadrado " + (i + 1) + " => " + testeArray.
					SquareArea(valorLado));
		}
		
		// calcular �rea de 5 c�rculos
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o raio para calcular a �rea do  "
					+ (i + 1) + " c�rculos");
			double valorRaio = scanner.nextDouble();
			System.out.println("�rea do c�rculo " + (i + 1) + " => " + testeArray.
					CircleArea(valorRaio));
		}
	}

}
