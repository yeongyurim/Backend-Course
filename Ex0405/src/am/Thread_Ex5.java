package am;

public class Thread_Ex5 extends Thread {

	// 현재 스레드가 해야할 일은 Frame_Ex5의 멤버 변수들 중 x 값을 5씩 증가시켜야 한다.
	// 그러므로 Thread_Ex5는 자신이 생성될 때 Frame_Ex5의 주소를 현재 객체가 생성될 때 받아야 한다.
	
	Frame_Ex5 frame;
	
	public Thread_Ex5(Frame_Ex5 frame) {
		this.frame = frame;
	}
	
	@Override
	public void run() {
		while(true) {
			frame.x += 5;
			// frame.x의 값이 p의 너비 50을 제한 값보다 크거나 같다면 탈출
			if(frame.x >= frame.p.getWidth()-50)
				break;
			
			frame.p.repaint();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
