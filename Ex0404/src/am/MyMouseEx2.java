package am;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseEx2 extends MouseAdapter {

Frame_Ex2 myframe;
	
	public MyMouseEx2(Frame_Ex2 frame) {
		this.myframe = frame;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		myframe.can.x = e.getX();
		myframe.can.y = e.getY();
		
		myframe.can.repaint();
	}
}
