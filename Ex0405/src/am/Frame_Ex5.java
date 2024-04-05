package am;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame_Ex5 extends JFrame {

	int x = 0;
	Thread_Ex5 thread;
	JPanel p = new JPanel() {

		@Override
		protected void paintComponent(Graphics g) {
			// 현재 JPanel의 크기와 같은 이미지 객체 생ㅅ어
			Image buff = createImage(this.getWidth(), this.getHeight());
			
			// 준비된 이미지 객체에만 그림을 그릴 수 있는 붓
			Graphics buff_g = buff.getGraphics();
			buff_g.setColor(Color.RED);
			buff_g.fillOval(x, 245, 50, 50);
			
			g.drawImage(buff, 0, 0, this);
		}
		
	};
	
	public Frame_Ex5() {
		this.add(p);
				
		this.setBounds(300, 100, 500, 450);
		this.setVisible(true);
		
		thread = new Thread_Ex5(this);
		// 종료 이벤트 지정
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		thread.start();
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex5();
	}

}
