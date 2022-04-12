package capitulo3;

public class Student {

	private String name;
	private double average;

	// construtor inicializa vari�veis de inst�ncia
	public Student(String name, double average) {
		this.name = name;

		// valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		// armazena o valor padr�o da m�dia da vari�vel de inst�ncia (0.0)
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribui � vari�vel de inst�ncia�
	}

	// define o nome de Student
	public void setName(String name) {
		this.name = name;
	}

	// recupera o nome de Student
	public String getName() {
		return name;
	}

	// define a m�dia de Student
	public void setAverage(double average) {
		// valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		// armazena o valor atual da m�dia da vari�vel de inst�ncia
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribui � vari�vel de inst�ncia�
	}

	// recupera a m�dia de Student
	public double getAverage() {
		return average;
	}

	// determina e retorna a letra da nota de Student
	public String getLetterGrade()
	 {
	 String letterGrade = ""; // inicializado como uma String vazia
	
	 if (average >= 90.0) 
	 letterGrade = "A"; 
	 else if (average >= 80.0)
	 letterGrade = "B"; 
	 else if (average >= 70.0)
	 letterGrade = "C"; 
	 else if (average >= 60.0)
	letterGrade = "D"; 
	 else 
	 letterGrade = "F"; 
	
	 return letterGrade;
	 }
}
