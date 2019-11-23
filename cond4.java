import java.util.Scanner;

public class cond4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora, hora2, soma;
		
		hora = sc.nextInt();
		hora2 = sc.nextInt();
		
		if (hora < 12) {
			soma = hora + hora2;
			System.out.println("O JOGO DUROU " + soma + " HORA(S)");
		}
		else {
			System.out.println("Boa noite");
		}

	}

}
