package ch12.sec06;
/*
 * 포장 클래슨느 문자열을 기본 타입 값으로 변환할 때도 사용된다.
 * 대부분의 포장 클래스에는 'parse+기본타입'명으로 정적 메소드가 있다.
 * 
 * 포장 객체는 내부 값을 비교하기 위해 == 와 != 연산자를 사용할 수 없다.
 * 이 연산은 내부의 값을 비교하는 것이 아니라 포장 객체의 번지를 비교하기 때문이다.
 * 
 * 포장 객체의 효율적 사용을 위해 다음 범위의 값을 갖는 포장 객체는 공유된다.
 * 이 범위의 값을 갖는 포장 객체는 ==와 != 연산자로 비교할 수 있지만, 내부 값을 비교하는 것이 아니라 객체 번지를 비교한다는 것을 알아야 한다.
 * 
 * boolean true,false
 * char \u0000 \u007f
 * -128~ 127
 */
public class ValueCompareExample {

	public static void main(String[] args) {
		// -128 ~ 127 초과 값일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==: " + (obj1 == obj2));
		System.out.println("equals(): " + obj1.equals(obj2));
		System.out.println();
		
		// -128~127 범위값일 경우
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==: " + (obj3 == obj4));
		System.out.println("equals: " + obj3.equals(obj4));
		
	}

}
