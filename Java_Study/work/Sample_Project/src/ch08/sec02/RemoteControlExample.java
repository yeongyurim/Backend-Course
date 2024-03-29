package ch08.sec02;
// 인터페이스도 하나의 타입이므로 변수의 타입으로 사용할 수 있다.
// 인터페이스는 참조 타입에 속하므로 인터페이스 변수에는 객체를 참조하고 있지 않다는 뜻으로 null을 대입할 수 있다.
// 인터페이스를 통해 구현 객체를 사용하려면, 인터페이스 변수에 구현 객체를 대입해야한다.
public class RemoteControlExample {

	public static void main(String[] args) {
		
		// rc 변수에 Television 객체를 대입
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		
		// rc변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}

}
