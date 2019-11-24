import java.util.Scanner;

public class cond4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ini, fim, duracao;
		
		System.out.println("Hora inicial: ");
		ini = sc.nextInt();
		System.out.println("Hora final: ");
		fim = sc.nextInt();
		
		if (ini < fim) {
			duracao = fim - ini;
		}
		else {
			duracao = 24 -ini + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
	}

}
