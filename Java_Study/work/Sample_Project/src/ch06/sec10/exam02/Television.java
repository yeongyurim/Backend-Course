package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	// 정적 필드는 선언과 동시에 초기값을 주는 것이 일반적이다.
	// 하지만 복잡한 초기화 작업이 필요하다면 정적 블록을 이용한다.
	// 정적필드는 객체 생성 없이도 사용할 수 있기 때문에 생성자에서 초기화 작업을 하지 않는다. 생성자는 객체 생성 후 실행되기 때문이다.
	static {
		info = company + "-" + model;
	}
}
