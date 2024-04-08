package raining;

import java.awt.Color;

public class Oval extends Thread {
	int x, y, wh, height, speed;
	Color color;
	
	public Oval(int width, int height) {
		wh = (int)(Math.random()*150+50);
		this.x = (int)(Math.random()*(width-wh));
		this.y = y-wh-50;
		this.height = height;
		
		// 색상을 무작위로 만들기 위해 랜덤 수행한다.
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		this.color = new Color(r, g, b);
		this.speed = (int)(Math.random()*10+1);
	}
	
	public boolean move() {
		this.y += speed;
		if(y > height+wh) {
			y = height+wh;
			return false;
		}
		return true;
	}
	
	@Override
	public void run() {
		while(move()) {
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
