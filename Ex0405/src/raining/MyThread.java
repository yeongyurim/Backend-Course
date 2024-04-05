package raining;

import java.util.Random;

public class MyThread extends Thread {
	Frame frame;
	
	public MyThread(Frame frame) {
		this.frame = frame;
	}
	
	@Override
	public void run() {
		while(true) {
			
			frame.p.repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
