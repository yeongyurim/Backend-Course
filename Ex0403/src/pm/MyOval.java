package pm;

import java.awt.Color;

public class MyOval {
	Color c; // 색상
	int x, y, wh;
	
	public MyOval(int x, int y) {
		// 그냥 x는 인자인 x를 의미하며 인자 x를
		// 멤버변수 x 즉, this.x에 저장한다.
		this.x = x;
		this.y = y;
		
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		c = new Color(red, green, blue);
		
		// 너비높이 값 지정
		wh = (int)(Math.random()*150+50);
	}
}
