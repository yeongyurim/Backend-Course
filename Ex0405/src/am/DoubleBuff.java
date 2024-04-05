package am;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DoubleBuff extends JFrame {

	int x = 200;
	Canvas can = new Canvas() {

		@Override
		public void paint(Graphics g) {
			//g.setColor(Color.GREEN);
			//g.fillRect(x, 235, 80, 30);
			
			// buffer 기능인 image객체를 현재 캔버스의 크기와 동일하게 생성한다.
			Image buff = createImage(this.getWidth(), this.getHeight());
			
			// 준비된 이미지 객체에만 그림을 그릴 수 있는 붓을 얻어낸다.
			Graphics buff_g = buff.getGraphics();
			
			buff_g.setColor(Color.GREEN);
			buff_g.fillRect(x, 235, 80, 30); // 이미지 객체에 도형 그리기
			
			// 이미지 객체를 현재 캔버스의 x=0,y=0 에 그린다.
			g.drawImage(buff, 0, 0, this);
		}

		// 지우는 동작을 하는 update에서 바로 paint로 redirect 하므로 화면 지움이 발생하지 않고 겹치게 된다.
		@Override
		public void update(Graphics g) {
			paint(g);
		}

	};
	
	public DoubleBuff() {
		this.add(can);
		
		this.setBounds(300, 100, 500, 600);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// 현재 창에서 키를 누를 때 이벤트 감지자 등록
		can.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				switch(code) {
					case KeyEvent.VK_LEFT :
						x -= 5;
						if(x < 0)
							x = 0;
						break;
					case KeyEvent.VK_RIGHT:
						x += 5;
						if(x > can.getWidth() - 80)
							x = can.getWidth()-80;
						break;
				} // switch문의 끝
				can.repaint();
			}
		});
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new DoubleBuff();
	}

}
