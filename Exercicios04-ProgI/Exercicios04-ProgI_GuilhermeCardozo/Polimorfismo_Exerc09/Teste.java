package Polimorfismo_Exerc09;

import Interface_Exerc07.*;

public class Teste {
	public static void main (String[] args) {
		
		Circulo testeCirculo = new Circulo();
		Quadrado testeQuadrado = new Quadrado();
		Triangulo testeTriangulo = new Triangulo();
		trianguloRetangulo testeTrianguloRetangulo = new trianguloRetangulo();
		
		Desenhista desenhista = new Desenhista();
		
		desenhista.desenha(testeCirculo);
		desenhista.desenha(testeQuadrado);
		desenhista.desenha(testeTriangulo);
		desenhista.desenha(testeTrianguloRetangulo);
	}

}
