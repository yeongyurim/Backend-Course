package error;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// space키 입력시 start
// 상자가 움직임
// 방향키를 입력시 해당 방향으로 움직임

// 동그라미 색깔 랜덤 
// 클릭한 지점에서 낙하
public class MyFrame_Ex1 extends JFrame {

	JPanel p;
	MyThread_Ex1 thread;
	Square square;
	int code;
	
	public MyFrame_Ex1() {
		square = new Square(this,200,200,30);
		
		p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// 현재 JPanel의 크기와 같은 이미지 객체 생성
				Image buff = createImage(this.getWidth(), this.getHeight());
				
				// 준비된 이미지 객체에만 그림을 그릴 수 있는 붓
				Graphics buff_g = buff.getGraphics();
				buff_g.setColor(Color.RED);
				buff_g.fillRect(square.x, square.y, square.wh, square.wh);
				
				g.drawImage(buff, 0, 0, this);
			}
		};
		
		this.add(p);
				
		this.setBounds(300, 100, 500, 450);
		this.setVisible(true);
		
		thread = new MyThread_Ex1(this);
		// 종료 이벤트 지정
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				code = e.getKeyCode();
				if(code == KeyEvent.VK_SPACE ) {
					code = (int)(Math.random()*4+37);
					thread.start();
				}
					
			}
		});
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrame_Ex1();
	}

}
