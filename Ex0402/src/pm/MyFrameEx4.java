package pm;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import am.MyWinEx1;

public class MyFrameEx4 extends JFrame {

	JLabel lb1, lb2, lb3, lb4;
	JPanel p1;
	
	public MyFrameEx4() {
		// 기본값은 가운데 정렬이다.
		p1 = new JPanel();
		
		// 경로 시작은 src부터이다.
		ImageIcon icon1 = 
				new ImageIcon("src/images/blog.png");
		// 생성된 이미지 아이콘을 lb1 생성할 때 넣어준다.
		lb1 = new JLabel(icon1);
		
		ImageIcon icon2 = 
				new ImageIcon("src/images/cafe.png");
		// 생성된 이미지 아이콘을 lb1 생성할 때 넣어준다.
		lb2 = new JLabel(icon2);
		
		ImageIcon icon3 = 
				new ImageIcon("src/images/mail.png");
		// 생성된 이미지 아이콘을 lb1 생성할 때 넣어준다.
		lb3 = new JLabel(icon3);
		
		ImageIcon icon4 = 
				new ImageIcon("src/images/stock.png");
		// 생성된 이미지 아이콘을 lb1 생성할 때 넣어준다.
		lb4 = new JLabel(icon4);
		
		p1.add(lb1);
		p1.add(lb2);
		p1.add(lb3);
		p1.add(lb4);
		
		this.add(p1, BorderLayout.NORTH);
		
		this.setBounds(300, 200, 350, 250);
		this.setVisible(true);
		this.addWindowListener(new MyWinEx1());
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrameEx4();

	}

}