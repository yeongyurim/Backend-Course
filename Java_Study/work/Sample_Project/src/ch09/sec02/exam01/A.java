package ch09.sec02.exam01;

// 클래스가 여러 클래스와 관계를 맺느 경우에는 독립적으로 선언하는 것이 좋으나,
// 특정 클래스만 관계를 맺을 경우에는 중첩 클래스로 선언하는 것이 유지보수에 도움이 된다.

// 중첩 클래스란 클래스 내부에 선언한 클래스를 말하는데, 중첩 클래스를 사용하면 클래스의 멤버를 쉽게 사용할 수 있고,
// 외부에는 중첩 관계 클래스를 감춤으로서 복잡성을 줄일 수 있따.

// public , default, private
// 공용     , 패키지 내부, 윗 클래스 안에서만
public class A {
	// 인스턴스 멤버 클래스
	class B {}
	
	// 인스턴스 필드 값으로 B객체 대입
	B field = new B();
	
	// 생성자
	A() {
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
}
