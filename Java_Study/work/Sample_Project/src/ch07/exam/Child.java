package ch07.exam;

public class Child extends Parent {
	public int studentNo;
	
	// 자식 객체를 생성하면 부모 객체가 먼저 생성된 다음에 자식 객체가 생성된다.
	// 부모 생성자는 자식 생성자의 첫 줄에 자동적으로 생성되는데
	// 만약 부모 클래스에 기본 생성자가 없다면 자식 생성자 선언에서 컴파일 에러가 발생한다.
	// 부모 클래스에 기본 생성자가 없고 매개변수를 갖는 생성자만 있다면 개발자는 super(매개값, ...)코드를 직접 넣어야 한다.
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}
