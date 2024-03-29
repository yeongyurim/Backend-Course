package ch08.sec06;
// 인터페이스에는 정적 메소드도 선언이 가능하다. 추상 메소드와 디폴트 메소드는 구현 객체가 필요하지만,
// 정적 메소드는 구현 객체가 없어도 인터페이스만으로 호출할 수 있다.

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();
	}

}
