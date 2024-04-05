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
// 더블 버퍼링
// 내부 클래스 장점 : 외부 클래스의 멤버에  자유로운 점근가능
public class HomeWork2 extends JFrame {

	class Ball {
		int x, y, wh;
		
		Ball(int x, int y, int wh) {
			this.x = x;
			this.y = y;
			this.wh = wh;
		}
		
		public void addX(int x) {
			this.x += x;
		}
		
		public void addY(int y) {
			this.y += y;
		}
	};
	
	int code = KeyEvent.VK_1;
	
	Canvas can;
	
	public HomeWork2() {
		// 좌표 및 크기 초기 설정
		Ball ball = new Ball(200- 30/2, 250-30/2, 30);
		
		// canvas 클래스 무명 객체 초기화
		can = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.setColor(Color.blue);
				g.fillOval(ball.x, ball.y, ball.wh, ball.wh);
				
				// 키 입력 값 분기
				switch(code) {
					case KeyEvent.VK_LEFT :
						ball.addX(-10);
						break;
					case KeyEvent.VK_RIGHT :
						ball.addX(10);
						break;
					case KeyEvent.VK_UP :
						ball.addY(-10);
						break;
					case KeyEvent.VK_DOWN :
						ball.addY(+10);
						break;
				}
			}
		};
		this.add(can);
		
		// JFrame 값 설정
		this.setBounds(300, 100, 400, 500);
		this.setVisible(true);
		
		// 윈도우 이벤트 감지자 등록
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료
			}
		});
		
		// Canvas 객체 Keylistener 추가
		can.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				code = e.getKeyCode();
				
				can.repaint();
			}
		});
	}
	
	public static void main(String[] args) {
		new HomeWork2();
	}

}
