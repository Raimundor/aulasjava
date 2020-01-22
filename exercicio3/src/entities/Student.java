package entities;

public class Student {
	public String name;
	public double tri1;
	public double tri2;
	public double tri3;
	
	public double finalGrade() {
		return tri1 + tri2 + tri3;
	}
	
	public String pass() {
		if (finalGrade() > 60) {
			return String.format("PASS");
		}
		else {
			return String.format("FAILED") + "\n"
			+ "MISSING " + String.format("%.2f",(60 - finalGrade())) + " POINTS";
		}
	}

}
