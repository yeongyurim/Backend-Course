package pm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Canvas_Ex7 extends Canvas {

	ArrayList<MyOval> list;
	
	public Canvas_Ex7() {
		list = new ArrayList<>();
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i=0; i<list.size(); i++) {
			// 리스트구조로부터 요소를 하나씩 가져온다.
			MyOval m = list.get(i);
			
			g.setColor(m.c);// 색상 변경
			g.fillOval(m.x - m.wh/2 , m.y - m.wh/2 , m.wh, m.wh);
		}
	}

}
