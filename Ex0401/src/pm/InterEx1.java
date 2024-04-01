package pm;
// 재정의를 통해서 다형성을 구현해낼 수 있다.
// 객체와 객체 사이의 중계 역할을 함

// class의 추상 메서드는 상속을 받기 위한 재정의
// interface의 추상 메서드는 자료형을 갖기 위한 재정의
public interface InterEx1 {
	// 상수 또는 추상 메소드(함수)들만 존재할 수 있다.
	final int value = 100; // final 키워드가 입력되어있지 않은 경우에는 jvm이 대신 붙여준다. (생략가능)
	
	public int sum(int n); // 앞에 abstract가 생략되어있다.
	
	public int product(int n);
	
	public int divide(int n);
	
	/*
	 * 인터페이스는 절대로 일반 메서드(함수)를 가질 수 없다.
	 * public void test() {
	 * 	System.out.println("TTTT");
	 * }
	 */
}
