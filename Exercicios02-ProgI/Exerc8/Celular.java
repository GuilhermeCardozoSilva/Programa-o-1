public class Celular {
	String marca, modelo;
	int numero;
	byte ddd;
	double precoCompra;
	boolean emLigacao;

	void discar(byte ddd, int numero) {
		// só efetiva a ligação se o atributo emLigacao estiver false
		if(emLigacao == false) {
			limparTela();
			System.out.print("Em ligação com " + "(" +  ddd + ")"+ numero);
		}
	}

	void desligar() {
		// só desliga quando houver uma ligação ativa
		if(emLigacao == true){
			limparTela();
			System.out.print("Ligação encerrada.");
		}
	}
	
	void limparTela() {
		for(int i = 0; i < 300; i++) {
				System.out.print("\r\n");
		}
	}

}
	



