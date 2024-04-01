package ch09.sec07.exam01;

// 익명 객체는 이름이 없는 객체를 말한다. 
// 명시적으로 클래스를 선언하지 않기 때문에 쉽게 객체를 생성할 수 있다는 장점잉 있다.
// 익명 객체는 필드값, 로컬 변수값, 매개변수값으로 주로 사용된다.

/*
 * 익명 객체는 클래스를 상속하거나 인터페이스를 구현해야만 생성할 수 있다.
 * 클래스를 상속해서 만들 경우 익명 자식 객체라고 하고, 인터페이스를 구현해서 만들 경우 익명 구현 객체라고 한다.
 */
public class Car {
	// 필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	// 필드에 익명 자식 객체 대입
	private Tire tire2 = new Tire()  {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	// 메소드 (필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	// 메소드(로컬 변수 이용)
	public void run2() {
		// 로컬 변수에 익명 자식 객체 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	// 메소드 (매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}
