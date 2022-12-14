package entities;

public class BankAccount {

	private int number;
	private String holder;
	private double balance;

	private static double tax = 5.0;

	//utilizando o método deposit para que a alteração no saldo não possa ser utilizada com o método set
	public BankAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}


	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + tax;
	}
	
	public String toString() {
		return String.format("Account %d", number) + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f%n", balance); 
	}

}
