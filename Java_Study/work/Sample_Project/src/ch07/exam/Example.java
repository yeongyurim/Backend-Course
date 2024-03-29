package ch07.exam;

public class Example {
	public static void action(A a) {
		a.method1();
		// Java 12 부터는 instanceof 연산의 결과가 true 일경우 우측 타입 변수를 사용할 수 있기 때문에 casting이 필요없다.
		if(a instanceof C c) {
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}
