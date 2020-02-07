package application;

public class Boxing {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj * 2;
		
		System.out.println(y);
		
		//Wrapper classes
		
		Integer k = 10;
		int j = k * 2;
		
		System.out.println(j);

	}

} 
