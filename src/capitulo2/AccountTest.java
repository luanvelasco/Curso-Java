package capitulo2;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	//Cria um objeto Accounts e atribui a myAccount
	Accounts myAccount1 = new Accounts();
	
	//Criar um objeto Accounts passando como parametro um nome
	Accounts myAccount2 = new Accounts("Harry Potter", 70.53);
	
	//Exibe o valor inicial do nome. Como o nome ainda não foi setado, espera-se um valor null
	System.out.printf("Initial name for Account1 without parameter name is: %s%n%n", myAccount1.getName());
	
	//Exibe o valor inicial do nome passado como parametro de entrada para o construtor
	System.out.printf("Initial name for Account 2 with parameter name is: %s%n%n", myAccount2.getName());
	
	//Exibe os saldos iniciais
	System.out.printf("%s's Account1 balance is:  %2f%n%n", myAccount1.getName(), myAccount1.getBalance());
	System.out.printf("%s's Account1 balance is:  %2f%n%n", myAccount2.getName(), myAccount2.getBalance());
	
	
	//Salvar um novo nome
	System.out.print("Enter the name: ");
	myAccount1.setName(input.nextLine());
	System.out.print("Enter deposit amount: ");
	myAccount1.setBalance(input.nextDouble());
	
	System.out.printf("%s's Account1 balance is:  %2f%n%n", myAccount1.getName(), myAccount1.getBalance());
	
	input.close();
	}
}
