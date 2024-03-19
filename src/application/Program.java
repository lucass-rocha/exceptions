package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.Exceptions;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

			System.out.println("Account Data:");
			System.out.print("Account number: ");
			int number = sc.nextInt();
			System.out.print("Account holder: ");
			String holder = sc.nextLine();
			sc.next();
			System.out.print("Account balance: ");
			double balance = sc.nextDouble();
			System.out.print("Account withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("withdraw how much? ");
			try {			
			acc.Withdraw(sc.nextDouble());
			System.out.println();
			System.out.printf("New balance: %.2f", acc.getBalance());
		}
		catch (Exceptions e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
