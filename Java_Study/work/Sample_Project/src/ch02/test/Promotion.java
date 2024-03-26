package ch02.test;

public class Promotion {

	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A';
		int intValue = byteValue;
		intValue = charValue;
		// short shortValue = charValue; short는 2바이트 부호 구분 char unsigned (유니코드 범위) 
		double doubleValue = byteValue;
	}

}
