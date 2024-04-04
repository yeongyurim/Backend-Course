package pm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

// 내부 클래스 장점 : 외부 클래스의 멤버에  자유로운 점근가능
public class Frame_Ex2 extends JFrame {

	int x, y;
	int code = KeyEvent.VK_1;
	
	Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.blue);
			// TODO Auto-generated method stub
			switch(code) {
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
			}
		}
	};
	
	public Frame_Ex2() {
		this.add(can);
		this.setBounds(300, 100, 400, 400);
		this.setVisible(true);
		
		// 윈도우 이벤트 감지자 등록
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료
			}
		});
		
		can.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				code = e.getKeyCode();
			}
		});
		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				
				can.repaint();
			}
		});
	}
	public static void main(String[] args) {
		new Frame_Ex2();
	}

}
