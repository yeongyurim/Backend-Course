package ch08.sec10.exam01;

// 인터페이스의 타입변환은 인터페이스와 구현 클래스간에 발생한다.
// 인터페이스 변수에 구현 객체를 대입하면 구현 객체는 인터페이스 타입으로 자동 타입 변환 된다.
// 반대로 인터페이스 타입을 구현 클래스 타입으로 변환시킬 수 있는데, 이때는 강제 타입 변환이 필요하다.
public class PromotionExample {

	public static void main(String[] args) {
		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 인터페이스 변수 선언
		A a;
		
		// 변수에 구현 객체 대입
		a = b; // A <- B (promotion)
		a = c;
		a = d;
		a = e;
	}

}
