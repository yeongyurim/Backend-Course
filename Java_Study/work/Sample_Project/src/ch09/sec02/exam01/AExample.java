package ch09.sec02.exam01;

// 인스턴스 멤버 클래스 B 내부에는 일반 클래스와 같이 필드, 생성자, 메소드 선언이 올 수 있게 할 수 있다.
public class AExample {

	public static void main(String[] args) {
		// A 객체 생성
		
		A a = new A ();
		
		A.B b = a.new B();
	}

}
