package drizzling;

import java.awt.Color;

public class Oval extends Thread {
	MyFrame_Ex2 frame;
	int x, y, wh, speed;
	Color color;
	
	public Oval(int x, int y, MyFrame_Ex2 frame) {
		wh = (int)(Math.random()*150+50);
		this.x = x-wh;
		this.y = y-wh;
		
		// 색상을 무작위로 만들기 위해 랜덤 수행한다.
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		this.color = new Color(r, g, b);
		this.speed = (int)(Math.random()*10+1);
		this.frame = frame;
	}
	
	public boolean move() {
		this.y += speed;
		if(y > frame.p.getHeight() - wh) {
			y = frame.p.getHeight() -wh;
			return false;
		}
		return true;
	}

	@Override
	public void run() {
		while(move()) {
			try {
				frame.p.repaint();
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
}
