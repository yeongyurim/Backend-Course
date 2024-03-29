package ch08.sec08;

// 구현 객체는 여러 개의 인터페이스를 implements 할 수 있다.
// 구현 객체가 인터페이스 A와 인터페이스 B를 구현하고 있다면, 각각의 인터페이스를 통해 구현 객체를 사용할 수 있다.
public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		// RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
		rc.turnOn();
		rc.turnOff();
		// Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = new SmartTelevision();
		// Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		searchable.search("https://www.youtube.com");
	}

}
