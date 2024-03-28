package ch07.sec06.package1;

/*
	protected는 같은 패키지에서는 default처럼 접근이 가능하나, 다른 패키지에서는 자식 클래스만 접근을 허용한다. 
	protected는 필드와 생성자 그리고 메소드 선언에 사용될 수 있다.
	
	접근 제한 수준
	private > default > protected > public
	
	접근 제한자		제한 대상					제한 범위
	public 		클래스, 필드, 생성자, 메소드		없음
	protected   필드, 생성자, 메소드   		같은 패키지이거나, 자식 객체만 사용가능
	default		
	
 */
public class A {
	// 필드 선언
	protected String field;
	
	// 생성자 선언
	protected A() {
	}
	
	// 메소드 선언
	protected void method() {
		
	}
}
