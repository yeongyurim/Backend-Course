package ch06.sec10.exam01;
// 자바는 클래스 로더를 이용해서 클래스를 메소드 영역에 저장하고 사용한다.
// 정적멤버란 메소드 영역의 클래스에 고정적으로 위치하는 멤버를 말한다.
// 필드와 메소드는 모두 정적 멤버가 될 수 있다.
// 정적 필드와 정적 메소드로 선언하려면 static 키워드를 추가하면 된다.
public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
