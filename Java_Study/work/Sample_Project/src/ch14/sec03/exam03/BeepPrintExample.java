package ch14.sec03.exam03;

import java.awt.Toolkit;
/*
 * Thread 자식 클래스로 생성
 * 
 * Thread 클래스를 상속한 다음 run() 메소드를 재정의해서 스레드가 실행할 코드를 작성하고 객체를 생성하면 된다.
 * 
 * 명시적인 자식 클래스를 정의하지 않고, 다음과 같이 THread 익명 자식 객체를 사용할 수도 있다.
 */
public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
