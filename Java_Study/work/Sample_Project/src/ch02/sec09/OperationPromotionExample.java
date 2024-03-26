package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;  // 컴파일 단계에서 연산
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; // int 타입으로 변환 후 연산
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;  // long 타입으로 변환 후 연산
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; // int 타입으로 변환 후 연산
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		int v8 = 10;
		int result5 = v8 / 4; // 정수 연산의 결과는 정수
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0; // double 타입으로 변환 후 연산
		System.out.println("result6: " +result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;  // double 타입으로 변환 후 연산
		System.out.println("result7: " + result7);
		
		/*
		 *  자바에서 +연산자는 피연산자가 모두 숫자일 경우에는 덧셈연산을 수행하고 피연산자 중 하나가 문자열인 경우에는 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산을 수행한다.
		 */
	}

}
