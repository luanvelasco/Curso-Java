package capitulo3;

import java.util.Scanner;

public class ControleFluxo {

	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// inicializando vari�veis nas declara��es�
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// processa 10 alunos utilizando o loop controlado por contador
		while (studentCounter <= 10) {
			// solicita ao usu�rio uma entrada e obt�m valor fornecido pelo usu�rio
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();

			// if...else est� aninhado na instru��o while�
			if (result == 1)
				passes = passes + 1;
			else
				failures = failures + 1;

			// incrementa studentCounter at� o loop terminar
			studentCounter = studentCounter + 1;
		}

		// fase de t�rmino; prepara e exibe os resultados
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		// determina se mais de 8 alunos foram aprovados�
		if (passes > 8)
			System.out.println("Bonus to instructor!");
		input.close();
	}

}
