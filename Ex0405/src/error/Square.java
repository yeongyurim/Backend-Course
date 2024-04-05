package error;

import java.awt.event.KeyEvent;

public class Square {
	MyFrame_Ex1 frame;
	int x, y, wh, speed;
	
	Square(MyFrame_Ex1 frame, int x, int y, int wh) {
		this.frame = frame;
		this.x = x;
		this.y = y;
		this.wh = wh;
		this.speed = 10;
	}
	
	Square(MyFrame_Ex1 frame, int x, int y, int wh, int speed) {
		this.frame = frame;
		this.x = x;
		this.y = y;
		this.wh = wh;
		this.speed = speed;
	}
	
	public void move() {
		switch(frame.code) {
		case KeyEvent.VK_LEFT :
			this.x -= speed;
			if(x < wh) 
				dead();
			break;
		case KeyEvent.VK_RIGHT :
			this.x += speed;
			if(x > frame.p.getWidth()-wh)
				dead();
			break;
		case KeyEvent.VK_UP :
			this.y -= speed;
			if(y < wh)
				dead();
			break;
		case KeyEvent.VK_DOWN :
			this.y += speed;
			if(y > frame.p.getHeight()-wh)
				dead();
			break;
		}
	}
	
	public void dead() {
		System.exit(0);
	}
}
