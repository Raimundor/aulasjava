import java.util.Scanner;

public class cond1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}

}
