package capitulo1;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da linha de comando
		Scanner input = new Scanner(System.in);

		int numero1; // primeiro número a comparar
		int numero2; // segundo número a comparar

		System.out.print("Enter first integer: "); // prompt
		numero1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

		System.out.print("Enter second integer: "); // prompt
		numero2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
		input.close();
		
		if (numero1 == numero2)
			System.out.printf("%d == %d%n", numero1, numero2);

		if (numero1 != numero2)
			System.out.printf("%d != %d%n", numero1, numero2);
		
		if (numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);

		if (numero1 > numero2)
			System.out.printf("%d > %d%n", numero1, numero2);

		if (numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1, numero2);

		if (numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1, numero2);
	}

}
