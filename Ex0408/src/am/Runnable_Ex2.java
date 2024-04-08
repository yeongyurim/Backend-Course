package am;

import java.awt.Color;

public class Runnable_Ex2 implements Runnable {
	
	// 스레드 동기화를 위한 동기화 관리 객체
	Object synObject = new Object();
	
	Frame_Ex2 frame;
	
	public Runnable_Ex2(Frame_Ex2 frame) {
		this.frame = frame;
	}
	
	// 빨간색 불을 켜는 동작
	public synchronized void redOn() {
		frame.bt_red.setBackground(Color.RED);
		frame.bt_green.setBackground(Color.GRAY);
		frame.bt_yellow.setBackground(Color.GRAY);
	}
	// 초록색 불을 켜는 동작
	public synchronized void greenOn() {
		frame.bt_red.setBackground(Color.GRAY);
		frame.bt_green.setBackground(Color.GREEN);
		frame.bt_yellow.setBackground(Color.GRAY);
	}
	// 노락색 불을 켜는 동작
	public synchronized void yellowOn() {
		frame.bt_red.setBackground(Color.GRAY);
		frame.bt_green.setBackground(Color.GRAY);
		frame.bt_yellow.setBackground(Color.YELLOW);
	}
	
	@Override
	public void run() {
		// 점유된 스레드의 이름을 얻어내자
		String name = Thread.currentThread().getName(); // 현재 접근한 스레드의 이름을 가져올 수 있음
		System.out.println(name);
		
		while(true) {
			// 현재 스레드의 이름이 "R"이면 빨간색 불을 켠다.
			if(name.equals("R")) {
				redOn();
			}
			else if(name.equals("G")) {
				greenOn();
			}
			else if(name.equals("Y")) {
				yellowOn();
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
