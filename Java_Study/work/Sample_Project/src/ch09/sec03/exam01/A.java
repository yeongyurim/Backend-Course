package ch09.sec03.exam01;
/*
 * 정적 멤버 클래스
 * 
 * public static class B { } 다른 패키지에서 B 클래스를 사용할 수 있다.
 * static class B { } 같은 패키지에서만 B 클래스를 사용할 수 있다.
 * private static class B { } A 클래스 내부에서만 B 클래스를 사용할 수 있다.
 */

// 정적 멤버 클래스 B는 A 클래스 내부에서 사용되기도 하지만, A 클래스 외부에서 A와 함꼐 사용되는 경우가 많기 때문에
// 주로 default 또는 public 접근 제한을 가진다.
// B 객체는 A 클래스 내부 어디든 객체를 생성할 수 있다.
public class A {
	// 인스턴스 멤버 클래스
	static class B {}
	
	// 인스턴스 필드 값으로 B 객체 대입
	B field1 = new B();
	
	// 정적 필드 값으로 B 객체 대입
	static B field2 = new B();
	
	// 생성자
	A() {
		B b = new B();
	}
	
	// 인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	// 정적 메소드
	static void method2() {
		B b = new B();
	}
}
