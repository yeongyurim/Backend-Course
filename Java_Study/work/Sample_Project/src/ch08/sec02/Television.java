package ch08.sec02;

// 객체 A가 인터페이스의 추상 메소드를 호출하면 인터페이스는 객체B의 메소드를 실행한다.
// 그렇다면 객체 B는 인터페이스에 선언된 추상 메소드와 동일한 선언부를 가진 메소드를 가지고 있어야 한다.

// 여기서 객체 B를 인터페이스를 구현한 (implements) 객체라고 한다. 인터페이스에 정의된 추상 메소드에 대한 실행 내용이 구현되어 있기 때문이다.
// 객체 B와 같은 구현 객체는 다음과 같이 인터페이스를 구현하고 있음을 선언부에 명시해야 한다.
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 봅니다.");
	}

}
