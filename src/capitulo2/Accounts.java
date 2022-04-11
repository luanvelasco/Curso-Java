package capitulo2;

public class Accounts {

	//variável de instância
	private String name;
	private double balance;
	
	//Construtor vazio
	public Accounts() {}
	
	//Construtor inicializa a variável com o parametro passado
	public Accounts(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//Método que deposita apenas uma quantia válida no saldo
	public void deposit(Double depositAmount) {
		if (depositAmount > 0) {
			balance += depositAmount;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Método para recuperar o nome do objeto
	public String getName() {
		return name;
	}

	//Método para definir o nome do objeto
	public void setName(String name) {
		this.name = name;
	}	
}
