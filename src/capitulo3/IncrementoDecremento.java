package capitulo3;

public class IncrementoDecremento {

	public static void main(String[] args) {
		// demonstra o operador de p�s-incremento
		int c = 5;
		System.out.printf("Initial C value is: %d%n", c); // imprime 5
		System.out.printf("Postincrementing c: %d%n", c++); // imprime 5�
		System.out.printf("Result of C after postincrement: %d%n", c); // imprime 6 �

		System.out.println(); // pula uma linha

		// demonstra o operador de pr�-incremento
		c = 5;
		System.out.printf("Initial C value is: %d%n", c); // imprime 5
		System.out.printf("Preincrementing c: %d%n", ++c); // imprime 6�
		System.out.printf("Result of C after preincrement: %d%n", c); // imprime 6 �

	}
}