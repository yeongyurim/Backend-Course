package pm;

import java.awt.Color;

public class Oval_Ex3 {
	Color c;
	int x, y, wh;
	
	public Oval_Ex3(int x, int y) {
		// 인자인 x, y는 사용자가 클릭할 때 해당 위치값을 받아야 하는 인자다.
		this.x = x;
		this.y = y;
		
		// 색상을 무작위로 만들기 위해 랜덤 수행한다.
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		this.c = new Color(r, g, b);
		
		wh = (int)(Math.random()*150+50);
	}
}
