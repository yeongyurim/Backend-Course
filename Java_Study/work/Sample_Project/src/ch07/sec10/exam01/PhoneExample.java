package ch07.sec10.exam01;

// 추상 클래스도 필드, 메소드를 선언할 수 있다.
// 그리고 자식 객체가 생성될 때 super()로 추상클래스의 생성자가 호출되기 때문에 생성자도 반드시 있어야 한다.
public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
