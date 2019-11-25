import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, tri, circ, pi = 3.14159, trap, quad, ret;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		tri = a * c / 2;
		circ = pi * c*c;
		trap = (a+b)*c/2;
		quad = b*b;
		ret = a*b;
 		
		System.out.printf("TRIANGULO = %.3f%n", tri);
		System.out.printf("CIRCULO = %.3f%n", circ);
		System.out.printf("TRAPEZIO = %.3f%n", trap);
		System.out.printf("QUADRADO = %.3f%n", quad);
		System.out.printf("RETANGULO = %.3f%n", ret);
		
		sc.close();

	}

}
