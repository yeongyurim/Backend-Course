package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// 자동차 객체 생성
		Car myCar = new Car();
		
		// run() 메소드 실행
		myCar.run();
		
		// 이전에는 Tire class를 상속받아 다형성을 구현했지만 이번엔 interface를 통해 구현했다.
		// 차이점은 interface는 추상적인 것으로서 자체의 사용성을 가지지 못하지만
		// 타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		// run() 메소드 실행(다형성: 실행결과가 다름)
		myCar.run();
		
	}

}
