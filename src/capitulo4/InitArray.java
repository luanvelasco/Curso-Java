package capitulo4;

public class InitArray {

	public static void main(String[] args) {
		// declara array variável e o inicializa com um objeto arrayÿ
		int[] array = new int[10]; // cria o objeto array

		// A lista de inicializador especifica o valor inicial de cada elementoÿ
		int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

		System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

		// gera saída do valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
		System.out.println("");
		System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna
		
		// gera saída do valor de cada elemento do array2
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array2[counter]);

	}

}
