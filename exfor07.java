import java.util.Scanner;

public class exfor07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			int q = i *i;
			int c = i * i *i;
			System.out.printf("%d %d %d%n", i, q, c);
		}
		
		sc.close();

	}

}
