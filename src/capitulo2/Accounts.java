package capitulo2;

public class Accounts {

	//vari�vel de inst�ncia
	private String name;
	private double balance;
	
	//Construtor vazio
	public Accounts() {}
	
	//Construtor inicializa a vari�vel com o parametro passado
	public Accounts(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//M�todo que deposita apenas uma quantia v�lida no saldo
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

	//M�todo para recuperar o nome do objeto
	public String getName() {
		return name;
	}

	//M�todo para definir o nome do objeto
	public void setName(String name) {
		this.name = name;
	}	
}
