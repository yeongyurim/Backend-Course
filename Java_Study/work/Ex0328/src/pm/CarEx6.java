package pm;

public class CarEx6 {
	// 자동차를 의미하는 클래스
	
	// 필요한 값들을 멤버 변수로 선언하자
	int speed = 0;
	String color;
	
	public void speedUp() {
		++speed;
	}
	
	public void stop() {
		speed = 0;
	}
}
