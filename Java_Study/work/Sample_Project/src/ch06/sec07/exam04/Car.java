package ch06.sec07.exam04;

// 매개값으로 객체의 필드를 다양하게 초기화하려면 생성자 오버로딩이 필요하다.
// 생성자 오버로딩 = 매개변수를 달리하는 생성자를 여러 개 선언하는 것을 말한다.
public class Car {
	// 필드 선언
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	Car() {}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
