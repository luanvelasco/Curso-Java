package capitulo3;

public class IncrementoDecremento {

	public static void main(String[] args) {
		// demonstra o operador de pós-incremento
		int c = 5;
		System.out.printf("Initial C value is: %d%n", c); // imprime 5
		System.out.printf("Postincrementing c: %d%n", c++); // imprime 5ÿ
		System.out.printf("Result of C after postincrement: %d%n", c); // imprime 6 ÿ

		System.out.println(); // pula uma linha

		// demonstra o operador de pré-incremento
		c = 5;
		System.out.printf("Initial C value is: %d%n", c); // imprime 5
		System.out.printf("Preincrementing c: %d%n", ++c); // imprime 6ÿ
		System.out.printf("Result of C after preincrement: %d%n", c); // imprime 6 ÿ

	}
}