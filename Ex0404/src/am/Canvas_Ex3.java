package am;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Canvas_Ex3 extends Canvas {
	// 이미지객체들을 저장하는 곳
	ArrayList<ImgVo> list;
	
	Toolkit tk; // 이미지를 생성할 때 필요함!
	
	public Canvas_Ex3() {
		list = new ArrayList<ImgVo>();
		tk = Toolkit.getDefaultToolkit();
	}

	@Override
	public void paint(Graphics g) {
		// list의 길이만큼 반복하면서 이미지를 그린다.
		for (int i=0; i<list.size(); i++) {
			// Toolkit을 가지고 Image를 생성!
			ImgVo vo = list.get(i);
			Image img = tk.getImage(vo.img_path);
			// Component 객체가 observer 객체를 가지고 있음
			g.drawImage(img, vo.x, vo.y, vo.wh, vo.wh, this);
		}
	}
}
