package ch09.exam;

import ch09.exam.Car.Tire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire(); // 인스턴스 멤버 클래스는 바깥 클래스의 객체가 있어야 사용할 수 있다.
		Car.Engine engine = new Car.Engine(); // 정적 멤버 클래스는 바깥 클래스의 객체가 없어도 사용될 수 있다.
	}
}
