package ch02.test;

public class Casting {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var = (double) intValue;
		byte var1 = (byte) intValue;
		int var2 = (int) doubleValue;
		//char var = (char) strValue;
	}
}
