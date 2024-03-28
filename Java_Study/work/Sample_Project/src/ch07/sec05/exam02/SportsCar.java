package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// 오버 라이딩할 수 없음
	/*
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
