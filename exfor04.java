import java.util.Scanner;

public class exfor04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			double a = sc.nextInt();
			double b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			}
			else{
				double div = a / b;
				System.out.printf("%.1f%n",div);
			}
			
		}
		
		sc.close();

	}

}
