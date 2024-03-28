package ch07.sec03.exam02;

public class SmartPhoneExample {

	/*
	 * 자바에서 자식 객체를 생성하면 부모 객체가 먼저 생성된 다음에 자식 객체가 생성된다.
	 */
	public static void main(String[] args) {
		// SmartPhone 객체 싱행
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		// Phone으로부터 상속 받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
	}

}
