package ClasseAbstrata_Exerc03;

public class Teste {

	public static void main(String[] args) {
		SubClasse Teste1 = new SubClasse();

		// chamando m�todo abstrato
		Teste1.um_metodo();
		
		// chamando m�todo n�o abstrato
		Teste1.metodoNormal();
	}

}
