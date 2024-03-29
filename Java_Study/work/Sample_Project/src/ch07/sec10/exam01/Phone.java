package ch07.sec10.exam01;

// 사전적 의미로 추상은 실체 간에 공통되는 특성을 추출한 것이다.
/*
 * 객체를 생성할 수 있는 클래스를 실체 클래스라고 한다면, 이 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스라고 한다.
 * 추상 클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 new 연산자를 사용해서 객체를 직접 생성할 수 없다.
 */
public abstract class Phone {
	// 필드 선언
	String owner;
	
	// 생성자 선언
	Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

