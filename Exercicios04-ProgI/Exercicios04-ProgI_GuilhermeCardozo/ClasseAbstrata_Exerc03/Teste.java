package ClasseAbstrata_Exerc03;

public class Teste {

	public static void main(String[] args) {
		SubClasse Teste1 = new SubClasse();

		// chamando método abstrato
		Teste1.um_metodo();
		
		// chamando método não abstrato
		Teste1.metodoNormal();
	}

}
