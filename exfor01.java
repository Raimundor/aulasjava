import java.util.Scanner;

public class exfor01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		for (int i=1; i<=x; i++) {
			 if (i % 2 !=0) {
				 System.out.print(i + ","); 
			 }
			 
		}
		
		sc.close();
		
	}

}
