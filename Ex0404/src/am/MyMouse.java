package am;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouse extends MouseAdapter {

	MyFrame myframe;
	
	public MyMouse(MyFrame myframe) {
		this.myframe = myframe;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		MyRect myRect = new MyRect(e.getX(), e.getY());
		myframe.can.list.add(myRect);
		myframe.can.repaint();
	}
	
}
