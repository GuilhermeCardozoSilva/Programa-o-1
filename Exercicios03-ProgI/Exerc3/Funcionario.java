import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Funcionario {
	String nome;
	String cpf;
	String estadoCivil;
	String dataNascimento;
	float salario;

	// método para ler os dados pelo teclado
	void cadastrar() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nome completo: ");
		nome = entrada.nextLine();

		System.out.println("CPF: ");
		cpf = entrada.nextLine();

		System.out.println("Estado civil: ");
		estadoCivil = entrada.nextLine();

		System.out.println("Data de nascimento: ");
		dataNascimento = entrada.nextLine();	

		System.out.println("Salário: ");
		salario = entrada.nextFloat();
	}

	
	// método para aplicar uma bonificação (em percentual) ao salário do funcionário
	float bonifica(float salario, float percentual) {
		float resultado;

		resultado = salario * (percentual / 100);

		return resultado;
	}

	public static void main(String[] args) {
		Funcionario novoFuncionario =  new Funcionario();

		novoFuncionario.cadastrar();

		Scanner entrada = new Scanner(System.in);
		float valorBonificacao = 0, percentualBonificacao;
		System.out.print("\n");
		System.out.println("Digite o valor de uma bonificação (em percentual) ao salário do funcionário: ");
		percentualBonificacao = entrada.nextFloat();

		valorBonificacao = novoFuncionario.bonifica(novoFuncionario.salario, percentualBonificacao);

		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.print("\n\tDados do funcionário\n\n");
		System.out.println("Nome completo: " + novoFuncionario.nome);
		System.out.println("CPF: " + novoFuncionario.cpf);
		System.out.println("Estado civil: " + novoFuncionario.estadoCivil);
		System.out.println("Data nascimento: " + novoFuncionario.dataNascimento);
		System.out.println("O valor da bonificação é de: " + "R$" + valorBonificacao);
	}
}

