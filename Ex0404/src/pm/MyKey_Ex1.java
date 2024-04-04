package pm;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKey_Ex1 extends KeyAdapter {
	
	Frame_Ex1 frame;
	
	public MyKey_Ex1(Frame_Ex1 frame) {
		this.frame = frame;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		frame.can.cmd = code;
		frame.can.repaint();
	}

}
