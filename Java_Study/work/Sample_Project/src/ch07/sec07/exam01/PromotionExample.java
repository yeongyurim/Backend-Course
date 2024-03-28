package ch07.sec07.exam01;

// 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 튀급될 수 있다.
// 자식 객체를 생성하고 이를 부모 객체 변수에 대입하면 자동 타입 변환이 일어난다.

class A {
	
}
class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}

// public 클래스는 java 파일당 하나만 선언할 수 있으며 그 클래스 명은 java 파일 명과 동일해야한다.
public class PromotionExample {
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1 = d;
	C c1 = e;
	
	// B b3 = e; // 상속관계에 있지 않을 떄 Promotion은 일어나지 않는다.
}
