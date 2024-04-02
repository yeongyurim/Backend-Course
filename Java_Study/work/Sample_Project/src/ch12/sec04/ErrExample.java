package ch12.sec04;
/*
 * 자바 프로그램은 운영체제상에서 바로 실행되는 것이 아니라 자바 가상 머신 위에서 실행된다.
 * 따라서 운영체제의 모든 기능을 자바 코드로 직접 접근하기란 어렵다.
 * 하지만 java.lang 패키지에 속하는 System 클래스를 이용하면 운영체제의 일부 기능을 활용할 수 있다.
 * 
 * System 클래스의 정적 필드와 메소드를 이용하면 프로그램 종료, 키보드 입력, 콘솔(모니터) 출력, 현재 시간 읽기, 시스템 프로퍼티 읽기 등이 가능하다.
 * 
 * out - 콘솔(모니터)에 문자 출력
 * err - 콘솔(모니터)에 에러 내용 출력
 * in - 키보드 입력
 * 
 * exit(int status) - 프로세스 종료
 * currentTimeMillis() - 현재 시간을 밀리초 단위의 long 값으로 리턴
 * nanoTime() - 현재 시간을 나노초 단위의 long 값으로 리턴
 * getProperty() - 운영체제와 사용자 정보 제공
 * getenv() - 운영체제의 환경 변수 정보 제공
 * 
 */
public class ErrExample {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
		}
	}

}
