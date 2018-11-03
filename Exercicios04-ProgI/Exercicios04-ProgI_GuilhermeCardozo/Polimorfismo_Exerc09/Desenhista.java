package Polimorfismo_Exerc09;

import Interface_Exerc07.*;

public class Desenhista {
	void desenha(Desenhavel d) {
		if(d instanceof Circulo) 
			System.out.println("A forma geom�trica que est� sendo explorada no momento"
					+ "� um C�RCULO.");
		else if(d instanceof Quadrado)
			System.out.println("A forma geom�trica que est� sendo explorada no momento"
					+ "� um QUADRADO.");
		else if (d instanceof trianguloRetangulo)
			System.out.println("A forma geom�trica que est� sendo explorada no momento"
					+ " � um TRI�NGULO RET�NGULO.");
		else if(d instanceof Triangulo)
			System.out.println("A forma geom�trica que est� sendo explorada no momento"
					+ "� um TRI�NGULO.");
	}
}
