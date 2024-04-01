package pack1;
/*
 * Library는 프로그램 개발시 활용할 수 있는 클래스와 인터페이스들을 모아놓은 것을 말한다.
 * 일반적으로 JavaArchiveR 압축 파일 형태로 존재한다.
 * JAR 파일에는 클래스와 인터페이스의 바이트코드 파일들이 압축되어 있다.
 */

/*
 * 프로그램 개발 시 라이브러리를 이용하려면 라이브러리 JAR 파일을 ClassPath에 추가해야 한다.
 * ClassPath란 말 그대로 클래스를 찾기 위한 경로이다. ClassPath에 라이브러리를 추가하는 방법은 다음과 같다.
 * - 콘솔(명령 프롬프트 또는 터미널)에서 프로그램을 실행할 경우
 *  - java 명령어를 실행할 때 -classpath로 제공
 *  - CLASSPATH 환경변수에 경로를 추가
 * - 이클립스 프로젝트에서 실행할 경우
 *  - project의 Build Path에 추가
 */
public class B {
	// 메소드 선언
	public void method() {
		System.out.println("B-method 실행");
	}
}
