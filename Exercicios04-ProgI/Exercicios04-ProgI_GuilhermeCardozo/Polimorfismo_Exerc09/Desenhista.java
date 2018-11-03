package Polimorfismo_Exerc09;

import Interface_Exerc07.*;

public class Desenhista {
	void desenha(Desenhavel d) {
		if(d instanceof Circulo) 
			System.out.println("A forma geométrica que está sendo explorada no momento"
					+ "é um CÍRCULO.");
		else if(d instanceof Quadrado)
			System.out.println("A forma geométrica que está sendo explorada no momento"
					+ "é um QUADRADO.");
		else if (d instanceof trianguloRetangulo)
			System.out.println("A forma geométrica que está sendo explorada no momento"
					+ " é um TRIÂNGULO RETÂNGULO.");
		else if(d instanceof Triangulo)
			System.out.println("A forma geométrica que está sendo explorada no momento"
					+ "é um TRIÂNGULO.");
	}
}
