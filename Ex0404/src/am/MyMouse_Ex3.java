package am;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouse_Ex3 extends MouseAdapter {

	Frame_Ex3 frame;
	
	public MyMouse_Ex3 (Frame_Ex3 f) {
		this.frame = f;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스를 클릭할 때마다 호출하는 곳!
		int x = e.getX();
		int y = e.getY();
		
		// 클릭한 지점을 알아냈으므로 이미지 객체를 생성하자!
		ImgVo vo = new ImgVo(x, y);
		
		// vo를 Frame_Ex3이 가지는 Canvas_Ex3 안에 list에 저장해야 한다.
		frame.can.list.add(vo);
		frame.can.repaint();
	}

}
