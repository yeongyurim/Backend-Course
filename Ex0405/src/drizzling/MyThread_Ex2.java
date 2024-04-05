package drizzling;

public class MyThread_Ex2 extends Thread {
	MyFrame_Ex2 frame;
	
	public MyThread_Ex2(MyFrame_Ex2 frame) {
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
