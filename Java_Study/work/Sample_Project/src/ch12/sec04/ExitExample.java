package ch12.sec04;

/*
 * 운영체제는 실행 중인 프로그램을 프로세스로 관리한다.
 * 자바 프로그램을 실행하면 JVM 프로세스가 생성되고,
 * 이 프로세스가 main() 메소드를 호출한다.
 * 프로세스를 강제 종료하고 싶다면 System.exit()메소드를 사용한다.
 */

public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			// i값 출력
			System.out.println(i);
			if(i ==5) {
				// JVM 프로세스 종료
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
	}

}
