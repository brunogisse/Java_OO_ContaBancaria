package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		BankAccount bankAcc;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit? (y/n): ");
		char action = sc.next().charAt(0);

		if (action == 'y') {
			System.out.print("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			bankAcc = new BankAccount(number, holder, initialDeposit);

		} else {
			bankAcc = new BankAccount(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(bankAcc);

		System.out.print("Enter deposit value: ");
		double amount = sc.nextDouble();
		bankAcc.deposit(amount);
		System.out.println("Account data:");
		System.out.println(bankAcc);

		System.out.print("Enter withdraw value: ");
		amount = sc.nextDouble();
		bankAcc.withdraw(amount);
		System.out.println("Account data:");
		System.out.print(bankAcc);

		sc.close();

	}

}
