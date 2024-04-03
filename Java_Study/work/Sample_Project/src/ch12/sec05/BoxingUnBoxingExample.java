package ch12.sec05;

/*
 * 포장 객체는 포장하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하는데 목적이 있다.
 * 이런 객체가 필요한 이유는 컬렉션 객체 때문이다.
 */
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		// Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산시 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
