package pm;

public class DataType {
	public static void main(String[] args) {
		// 기본자료형
		// - 논리형: boolean
		// - 문자형: char
		// - 정수형: byte short int long
		// - 실수형: float double
		
		boolean b1 =  true;
		
		char ch1 = 'A';
		
		System.out.println("ch1:"+ch1); // 변수 ch1의 값을 출력한다.
		// + 연산자는 피연산자들이 정수이거나 실수일 때는 더하는 연산을 수행한다.
		// 하지만 피연산자들 중 하나라도 문자열이면 다른 쪽의 값을 문자열(string)으로 변환하여 문자열 연결연산자의 역할을 수행한다.
		
		// 정수형 변수 a를 선언하면서 100을 저장하자!
		byte a = 127; // -128 ~ 127 사이 값 저장가능
		short b = 32767;
		int c = 2100000000;
		long d = 20000000000000l; // 정수 리터럴은 기본적으로 int형으로 취급때문에 long형은 뒤에 l을 붙여 명시해주어야 한다.
		
		// 실수형 변수를 저장하기 위해서는 실수형(float, double)을 지정하여 저장해야 한다.
		// 예) 3.14를 저장하는 변수 f를 선언하고 저장하시오!
		float f = 3.14f; // 실수 리터럴은 기본적으로 double형으로 취급되기 때문에 f를 붙여 float형임을 명시해주어야한다.
	}
}
