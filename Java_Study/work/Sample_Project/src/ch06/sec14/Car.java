package ch06.sec14;
/*
 * 객체의 필드(데이터)를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성(결점이 없는 성질)이 깨질 수 있다.
 * 이러한 문제점 때문에 객체 지향 프로그래밍에서는 직접적인 외부에서의 필드 접근을 막고 대신 메소드를 통해 필드에
 * 접근하는 것을 선호한다.
 * 이러한 역할을 하는 메소드가 Setter이다.
 * 
 * 필드 타입 boolean일 경우에는 Getter는 get으로 시작하지 않고 is로 시작하는 것이 관례이다.
 */
public class Car {
	// 필드 선언
	private int speed;
	private boolean stop;
	
	// speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
