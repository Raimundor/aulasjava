import java.util.Locale;
import java.util.Scanner;

public class cond5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		
		double preco1, preco2, preco3 ,preco4 ,preco5, total;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		preco1 = 4.00;
		preco2 = 4.50;
		preco3 = 5.00;
		preco4 = 2.00;
		preco5 = 1.50;
		
		
		if (cod == 1) {
			total = qtd * preco1;
		}
		else if (cod == 2) {
			total = qtd * preco2;
		}
		else if (cod == 3) {
			total = qtd * preco3;
		}
		else if (cod == 4) {
			total = qtd * preco4;
		}
		else if (cod == 5){
			total = qtd * preco5;
		}
		else {
			total = 0;
			System.out.println("Sem Cadastro");
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
