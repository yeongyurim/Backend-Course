package ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		/*
		 * 비트 시프트 연산은 좌측 시프트 시에는 2^n 을 곱해주는 연산이고 우측은 반대로 2^n을 나눈다.
		 */
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
	}

}
