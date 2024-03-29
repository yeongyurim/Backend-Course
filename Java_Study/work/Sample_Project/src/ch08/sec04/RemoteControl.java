package ch08.sec04;
// 추상 메소드는 리턴 타입, 메소드명, 매개변수만 기술되고 중괄호를 붙이지 않는 메소드를 말한다.
public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
