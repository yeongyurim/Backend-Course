package ch07.sec08.exam02;

public class Taxi extends Vehicle {
	// 메소드 재정의(오버라이딩)
	@Override //컴파일러에서 오버라이딩이 되는지 확인해줌
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
