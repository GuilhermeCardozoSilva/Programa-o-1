package ClasseAbstrata_Exerc05;

public class Area extends Shape {

	@Override
	public double RectangleArea(double comprim, double larg) {
		return (comprim * larg);
	}

	@Override
	public double SquareArea(double lado) { 
		return (lado * lado);
	}

	@Override
	public double CircleArea(double raio) {
		return (Math.PI*(raio*raio));
	}

}
