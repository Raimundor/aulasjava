package application;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		String nome = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		String inicio = sc.next();
		if (inicio == "y") {
			System.out.print("Enter initial deposit value: ");
			double valor = sc.nextDouble();
			account = new Account();
		}else {
			System.out.println("nao");
		}
		account = new Account(conta,nome);
		
		
		sc.close();

	}

}
