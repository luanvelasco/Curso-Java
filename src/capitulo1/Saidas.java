package capitulo1;

public class Saidas {
	public static void main(String[] args) {
	
	/*
	 * Abaixo est�o as principais diferen�as dos m�todos
	 * 
	 * 1) O System.out.println - Insere uma nova linha, deixando o marcador posicionado na linha abaixo;
	 * 2) O System.out.print - Mant�m o cursor na mesma linha. Geralmente s�o utilizadas sequ�ncias de escape para pular uma linha;
	 * 3) System.out.printf - Especifica o formato da entrada do tipo de valor, que deve ser o mesmo tipo de dados apontado na instru��o. Se possuir alguma d�vida verifique a tabela acima dos tipos de dados que podem ser usados
	 */
	
	
	//System.out.println
		System.out.println("Teste 1");
		System.out.println("Teste 2");
		System.out.println("-------");
	
		//System.out.print
		System.out.print("Teste 3");
		System.out.print("Teste 4");
		
	//System.out.printf
		System.out.println("\n-------");
		System.out.printf("Representa numeros inteiros: %d%n"
				+ "Representa numeros floats: %f%n"
				+ "Representa numeros doubles: %2f%n"
				+ "Representa valores booleanos: %b%n"
				+ "Representa valores char: %c%n"
				+ "Representa Strings %s",
				10, 11.2546, 15.5, false, 'c', "Teste");
		
	}
}
