package ch06.sec15;
/*
 * app에서 단 한개의 객체만 생성해서 사용하고 싶다면 싱글톤 패턴을 적용할 수 있다.
 * 싱글톤 패턴의 핵심은 생성자를 private 접근 제한해서 외부에서 new 연산자로 생성자를 호출할 수 없도록 막는 것이다.
 */
public class Singleton {
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자 선언
	
	private Singleton() {
		
	}
	
	// public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}
}
