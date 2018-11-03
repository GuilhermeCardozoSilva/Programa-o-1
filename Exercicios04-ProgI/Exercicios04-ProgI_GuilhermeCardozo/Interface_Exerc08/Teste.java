package Interface_Exerc08;

import Interface_Exerc07.*; 

public class Teste {
    public static void main(String[] args) {
        // instânciando as classes geométricas
        Circulo circulo1 = new Circulo();
        Quadrado quadrado1 = new Quadrado();
        Triangulo triangulo1 = new Triangulo();
        trianguloRetangulo trianguloRetangulo1 = new trianguloRetangulo();
        
        // chamando o método área de cada forma geométrica
        circulo1.area();
        quadrado1.area();
        triangulo1.area();
        trianguloRetangulo1.area();
    }
}
