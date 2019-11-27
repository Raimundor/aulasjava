<<<<<<< HEAD
=======
import java.util.Locale;
import java.util.Scanner;
>>>>>>> 65fba2b0b0bfce87c021f902bf02a86824112a2c

public class cond7 {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
>>>>>>> 65fba2b0b0bfce87c021f902bf02a86824112a2c

	}

}
