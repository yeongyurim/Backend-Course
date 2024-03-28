package ch07.sec05.exam02;

//  메소드를 선언할 때 final 키워드를 붙이면 이 메소드는 최종적인 메소드이므로 오버라이딩 할 수 없는 메소드가 된다.
// 즉 부모 클래스를 상속해서 자식 클래스를 선언할 떄, 부모 클래스에 선언된 final 메소드는 자식 클래스에서 재정의 할 수 없다.
public class Car {
	// 필드 선언
	public int speed;
	
	// 메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	// final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
