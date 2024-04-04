package pm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class Canvas_Ex1 extends Canvas {
	int cmd; // 사용자가 선택한 키의 코드값이 저장되는 곳
	int x =10, y =10;
	@Override
	public void paint(Graphics g) {
		// cmd라는 변수 값이 KeyEvent.VK_~
		// 갑ㅄ들과 비교하여 원하는 도형을 그린다.
		switch(cmd) {
			case KeyEvent.VK_1 :
				g.drawOval(x, y, 100, 100);
				break;
			case KeyEvent.VK_2 :
				g.fillOval(x, y, 100, 100);
				break;
			case KeyEvent.VK_3 :
				g.drawRect(x, y, 100, 100);
				break;
			case KeyEvent.VK_4 :
				g.fillRect(x, y, 100, 100);
				break;
			case KeyEvent.VK_5 :
				g.drawString("쌍용교육센터", x, y);
				break;
		}
	}
	
	
}
