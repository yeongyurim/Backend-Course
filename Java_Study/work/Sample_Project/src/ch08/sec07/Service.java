package ch08.sec07;

/*
 * private 메소드 - 구현 객체가 필요한 메소드
 * private 정적 메소드 - 구현 객체가 필요 없는 메소드
 * private 메소드는 디폴트 메소드 안에서만 호출이 가능한 반면, private 정적 메소드는 디폴트 메소드 뿐만 아니라 정적 메소드 안에서도 호출이 가능하다.
 * private 메소드의 목적은 디폴트와 정적 메소드들의 중복 코드를 줄이기 위함이다.
 */
public interface Service {
	// 디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	
	// private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	
	// 정적 메소드 
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
}
