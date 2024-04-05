package am;

public class Main_Ex3 {

	public static void main(String[] args) {
		// 프로그램 시작.
		Thread_Ex3 thread = new Thread_Ex3(); // 스레드 생성
		thread.start(); // 스레드 시작 --> run() 메소드 호출
		
		Thread_Ex4 thread1 = new Thread_Ex4(); // 스레드 생성
		thread1.start(); // 스레드 시작 --> run() 메소드 호출
		
		System.out.println("스레드 연습");
	}

}
