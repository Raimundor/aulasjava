package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double converter(double quanty, double dolar) {
		return quanty * dolar * (1.0 + IOF);
	}

}
