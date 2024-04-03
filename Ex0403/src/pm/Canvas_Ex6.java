package pm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Canvas_Ex6 extends Canvas {

	int x, y;
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		// 클릭한 x,y 좌표값을 문자열로 그린다.
		String strPos = new StringBuilder("x:")
				.append(x)
				.append(", y:")
				.append(y)
				.toString();
		
		g.setColor(Color.BLUE);
		g.drawString(strPos.toString(), x, y);
		g.drawOval(x, y, 10, 100);
	}

}
