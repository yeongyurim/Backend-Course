package ch06.sec09;

// 인스턴스 멤버 - 객체에 소속된 멤버 (객체를 생성해야만 사용할 수 있는 멤버)
// 정적 멤버 - 클래스에 고정된 멤버 (객체 없이도 사용할 수 있는 멤버)
public class Car {
	// 필드 선언
	String model;
	int speed;
	
	// 생성자 선언
	Car(String model) {
		// 객체 내부에서는 인스턴스 멤버에 접근하기 위해 this를 사용할 수 있다.
		// 객체는 자신을 this라고 하며 생성자와 메소드의 매개변수명이 인스턴스 멤버인 필드명과 동일한 경우
		// 인스턴스 필드임을 강조하고자 할때 this를 주로 사용한다.
		this.model = model; // 매개변수를 필드에 대입(this 생략 불가)
	}
	
	// 메소드 선언
	void setSpeed(int speed) {
		this.speed = speed; // 매개변수를 필드에 대입(this 생략 불가)
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model+"가 달립니다.(시속:" +this.speed +"km/h)");
	}
}
