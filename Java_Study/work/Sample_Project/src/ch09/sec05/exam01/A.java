package ch09.sec05.exam01;

/*
 * 중첩 클래스는 바깥 클래스와 긴밀한 관계를 맺으면서 바깥 클래스의 멤버(필드, 메소드)에 접근할 수 있다.
 * 하지만 중첩 클래스가 어떻게 선언되느냐에 따라 접근 제한이 있을 수 있다.
 */

/*
 * 바깥 클래스의 멤버 접근 제한
 * 
 * 정적 멤버 클래스 내부에서는 바깥 클래스의 필드와 메소드를 사용할 때 제한이 따른다.
 * 
 * 인스턴스 멤버 클래스 - 바깥 클래스의 모든 필드와 메소드
 * 정적 멤버 클래스 - 바깥 클래스의 정적 필드와 정적 메소드
 */
public class A {
	// A의 인스턴스 필드와 메소드
	int field1;
	void method1() { }
	
	// A의 정적 필드와 메소드
	static int field2;
	static void method2() { }
	
	// 인스턴스 멤버 클래스
	class B {
		void method() {
			// A의 인스턴스 필드와 메소드 사용
			field1= 10;
			method1();
			
			// A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스
	static class C {
		void method() {
			// A의 인스턴스 필드와 메소드 사용
			// field1 = 10;
			// method1();
			// A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
}
