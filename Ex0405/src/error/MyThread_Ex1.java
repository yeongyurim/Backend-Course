package error;

import java.awt.event.KeyEvent;

public class MyThread_Ex1 extends Thread {
	MyFrame_Ex1 frame;
	
	public MyThread_Ex1(MyFrame_Ex1 frame) {
		this.frame = frame;
	}
	
	@Override
	public void run() {
		while(true) {
			frame.square.move();
			
			frame.p.repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
