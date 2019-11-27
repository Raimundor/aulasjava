import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double pi = 3.14159;
		
		double area = Math.pow(r, 2)*pi;
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
