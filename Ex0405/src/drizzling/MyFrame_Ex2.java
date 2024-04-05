package drizzling;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 색깔 랜덤 동그라미 낙하

// x 가 랜덤한 위치에서 y = - 지점에서 낙하
public class MyFrame_Ex2 extends JFrame{
	JPanel p;
	ArrayList<Oval> ovalArr;
	
	public MyFrame_Ex2() {
		
		ovalArr = new ArrayList<>();
		
		p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// 현재 JPanel의 크기와 같은 이미지 객체 생성
				Image buff = createImage(this.getWidth(), this.getHeight());
				
				// 준비된 이미지 객체에만 그림을 그릴 수 있는 붓
				Graphics buff_g = buff.getGraphics();
				for(int i=0; i<ovalArr.size(); i++) {
					Oval oval = ovalArr.get(i);
					buff_g.setColor(oval.color);
					buff_g.fillOval(oval.x, oval.y, oval.wh, oval.wh);
				}
				
				g.drawImage(buff, 0, 0, this);
			}
		};
		
		this.add(p);
				
		this.setBounds(300, 100, 500, 450);
		this.setVisible(true);
		
		// 종료 이벤트 지정
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		p.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// 내부에서 바깥 클래스의 객체를 주고 싶을 때는 바깥 클래스로 선언을 하고
				Oval oval = new Oval(e.getX(), e.getY(), MyFrame_Ex2.this);
				oval.start();
				ovalArr.add(oval);
				p.repaint();
			}
		});
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrame_Ex2();
	}
}
