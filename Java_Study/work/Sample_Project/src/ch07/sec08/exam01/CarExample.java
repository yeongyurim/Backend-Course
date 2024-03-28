package ch07.sec08.exam01;

public class CarExample {

	// 다형성이란 사용 방법은 동일하지만 실행 결과가 다양하게 나오는 성질을 말한다.
	// 프로그램을 구성하는 객체를 바꾸면 프로그램의 실행 성능이 다르게 나올 수 있다.
	
	// 객체 사용 방법이 동일하다는 것은 동일한 메소드를 가지고 있다는 뜻이다.
	// 만약 자식 메소드가 부모 메소드를 오버라이딩 하고 있다면, 타이어 메소드 호출 시 오버라이딩된 메소드가 호출된다.
	
	// 자동 타입 변환 + 메소드 오버라이딩 = 다형성
	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		// Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		// HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		// KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
