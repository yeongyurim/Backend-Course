package ch06.sec11.exam01;
/*
 * 인스턴스 필드와 정적 필드는 언제든지 값을 변경할 수 있다.
 * 그러나 값을 변경하는 것을 막고 읽기만 허용하고 싶을 때 상수와 final 필드를 선언하여 사용한다.
 */
public class Korean {
	// 인스턴스 final 필드 선언
	final String nation = "대한민국";
	final String ssn;
	// final 필드는 초기값이 저장되면 프로그램 실행도중에 수정할 수 없게 된다.
	/*
	 * final 필드에 초기값을 줄 수 있는 방법
	 * 1. 필드 선언 시에 초기값 대입
	 * 2. 생성자에서 초기값 대입
	 */
	
	// 인스턴스 필드 선언
	String name;
	
	// 생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
