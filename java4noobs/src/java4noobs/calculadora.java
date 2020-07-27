package java4noobs;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println("Escolha o primeiro numero: ");
		int x = sc.nextInt();
		System.out.println("Escolha o segundo numero: ");
		int y = sc.nextInt();
		
		System.out.println("Escoha as opções de operações:");
		System.out.println("Somar (1)");
		System.out.println("Subtrair (2)");
		System.out.println("Multiplicar (3)");
		System.out.println("Dividir (4)");
		System.out.println("Modulo (5)");
		
		int op= sc.nextInt();
		int res = 0;
		
		if(op == 1) {
			res = x + y;
		}
		else if(op == 2) {
			res = x - y;
		}
		else if(op == 3) {
			res = x * y;
		}
		else if(op == 4) {
			res = x / y;
		}
		else if(op == 5) {
			res = x % y;
		}
		else {
			System.out.println("Informe a operação correta");
		}
		
		System.out.println("A resposta é: " + res);
		
		sc.close();

	}

}
