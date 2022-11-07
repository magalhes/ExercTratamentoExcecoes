package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawBalance = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawBalance);
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println(acc);
		}
		catch(Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

	}

}
