package raining;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {

	JPanel p;
	MyThread thread;
	GenerateThread threadG;
	ArrayList<Oval> ovalArr;
	
	public Frame() {
		
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
					if((oval.height+oval.wh) == oval.y)
						ovalArr.remove(i);
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
		threadG = new GenerateThread(this);
		threadG.start();
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame();
	}
}
