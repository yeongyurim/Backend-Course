package am;
/**
 * @author gyurim
 */
 /*
 장제목 : 1장 자바 시작하기
 */
public class Test1 {
	//프로그램 실행 진입점
	// 자바에서 main함수가 시작하는 부분이다.
	// main함수는 JVM에 의해 자동 호출되는 곳이다.
	public static void main(String[] args) {
		//콘솔에 출력하는 실행문
		System.out.println("자바 시작!");
		//Test2 a = new Test2();
		//a.ex1();
		ex1();
		System.out.println("프로그램 끝");
	} // main함수의 끝 (프로그램 끝)
	
	public static void ex1() {
		System.out.println("ex1함수");
	}
}
/*
class Test2 {
	public void ex1() {
		System.out.println("자바시작2");
	}
}
*/
