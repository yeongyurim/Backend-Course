package pm;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Cannon {
	Color color;

	int x, y, width, height, speed;
	Wheel wheel1, wheel2;

	public Cannon(int x, int y, int width, int height, int speed) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.wheel1 = new Wheel(x+width/5,y-width/3,(width+height)/4);
		this.wheel2 = new Wheel(x+(width-width/5),y-width/3,(width+height)/4);
	}
	
	public void move(int code) {
		switch(code) {
		case KeyEvent.VK_LEFT :
			this.x -= speed;
			break;
		case KeyEvent.VK_RIGHT :
			this.x += speed;
			break;
		}
	}
	
	class Wheel {
		int x, y, width, height;
		public Wheel(int x, int y, int wh) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
	}
	
	class Body {
		int x, y;
		
		public Body() {
			
		}
	}
}
