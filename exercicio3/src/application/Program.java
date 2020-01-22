package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Entrada:");
		student.name = sc.nextLine();
		student.tri1 = sc.nextDouble();
		student.tri2 = sc.nextDouble();
		student.tri3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = "+ String.format("%.2f", student.finalGrade())+ "\n");
		System.out.println(student.pass());
		
		sc.close();

	}

}
