package capitulo1;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da linha de comando
		Scanner input = new Scanner(System.in);

		int numero1; // primeiro n�mero a comparar
		int numero2; // segundo n�mero a comparar

		System.out.print("Enter first integer: "); // prompt
		numero1 = input.nextInt(); // l� o primeiro n�mero fornecido pelo usu�rio

		System.out.print("Enter second integer: "); // prompt
		numero2 = input.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio
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
