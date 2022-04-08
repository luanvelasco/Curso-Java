package capitulo1;

import java.util.Scanner;

public class Entradas {

	public static void main(String[] args) {
		
		//Cria uma Scanner para obter entrada a partir do console
		Scanner input = new Scanner(System.in);
		
		//Declarando variáveis;
		int numero1, numero2, soma;
		
		System.out.print("Insira o primeiro numero: ");
		numero1 = input.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		numero2 = input. nextInt();
		input.close();
		
		soma = numero1 + numero2;
		
		System.out.printf("A soma %d%n", soma);
		
		
	}

}
