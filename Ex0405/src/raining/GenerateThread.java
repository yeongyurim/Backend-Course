package raining;

import java.util.Random;

public class GenerateThread extends Thread {
	Frame frame;
	Random ran = new Random();
	
	public GenerateThread(Frame frame) {
		this.frame = frame;
	}
	
	public void run() {
		while(true) {
			//if(ran.nextBoolean()) {
				Oval oval = new Oval(frame.p.getWidth(), frame.p.getHeight());
				oval.start();
				frame.ovalArr.add(oval);
			//}
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
