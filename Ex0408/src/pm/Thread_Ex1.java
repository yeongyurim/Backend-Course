package pm;

public class Thread_Ex1 extends Thread {
	Frame_Ex1 frame;
	
	public Thread_Ex1(Frame_Ex1 frame) {
		this.frame = frame;
	}

	@Override
	public void run() {
		while(true) {
			Meteor meteor = new Meteor(frame);
			frame.meteors.add(meteor);
			meteor.start();
			
			try {
				Thread.sleep( 150 - (frame.current_stage*10) );
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
