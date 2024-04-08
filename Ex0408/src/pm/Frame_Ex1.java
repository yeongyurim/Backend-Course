package pm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame_Ex1 extends JFrame {

	// 상수
	private final int FINAL_STAGE = 6;
	private final int MAX_LIFE = 5;
	private final int MAX_BULLET = 5;
	
	// 크기 객체 Dimension
	Dimension d = new Dimension(390, 590);
	
	// 필요한 각 이미지들
	Image back_img, me_img, meteor_img;
	Me me = new Me();
	
	// 스테이지
	int current_stage;
	int life;
	
	ArrayList<Bullet> bullets = new ArrayList<>();
	ArrayList<Meteor> meteors = new ArrayList<>();
	
	JPanel p = new JPanel() {
		@Override
		protected void paintComponent(Graphics g) {
			// 배경 그리기
			g.drawImage(back_img, 0, 0, this);
			g.drawImage(me_img, me.pos.x, me.pos.y, this);
			
			for (int i=0; i<meteors.size(); i++) {
				Meteor meteor =  meteors.get(i);
				g.drawImage(meteor_img, meteor.meteor_pos.x, meteor.meteor_pos.y, this);
			}
			
			for (int i=0; i<bullets.size(); i++) {
				Bullet bullet =  bullets.get(i);
				g.setColor(Color.GREEN);
				g.fillRect(bullet.bullet_pos.x, bullet.bullet_pos.y, 
						bullet.bullet_pos.width, bullet.bullet_pos.height);
			}
			
			for (int i=0; i<life; i++) {
				g.setColor(Color.BLUE);
				g.fillOval(d.width-120+(i*20), 10, 20, 20);
			}
		}
	};
	
	// 운석 생성 스레드 생성
	Thread_Ex1 thread;
	
	// 난이도 상승 스레드 생성
	Thread levelUpThread;
	
	public Frame_Ex1() {
		// 이미지 객체들 초기화
		back_img = new ImageIcon("src/images/back.jpg").getImage();
		me_img = new ImageIcon("src/images/me.png").getImage();
		meteor_img = new ImageIcon("src/images/meteor.png").getImage();
		
		init_game(); 
		init_me_pos(); 
		
		this.setLocation(300, 100); 
		this.pack(); 
		this.setResizable(false);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				switch (code) {
				case KeyEvent.VK_LEFT:
					me.pos.x -= 5;
					if(me.pos.x < 0)
						me.pos.x = 0;
					break;
				case KeyEvent.VK_RIGHT:
					me.pos.x += 5;
					if(me.pos.x > d.width-me.pos.width)
						me.pos.x = 0;
					break;
				case KeyEvent.VK_SPACE:
					if(bullets.size() > MAX_BULLET)
						break;
					Bullet bullet = new Bullet(Frame_Ex1.this);
					bullets.add(bullet);
					bullet.start();
					break;
				} 
				p.repaint();	
			}
		});
		
		thread = new Thread_Ex1(this);
		thread.start();
		
		levelUpThread = new Thread( new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(current_stage != FINAL_STAGE) {
					try {
						int second = 10;
						Thread.sleep(1000*second);
					} catch (Exception e) {
						// TODO: handle exception
					}
					current_stage++;
				}
			}
		});
		levelUpThread.start();
	}
	
	private void init_me_pos() {
		int imgWidth = me_img.getWidth(this); 	// 주인공 이미지의 너비
		int imgHeight = me_img.getHeight(this); // 주인공 이미지의 높이
		
		// me 객체 안에 Rectangle의 x, y, width, height 지정
		me.pos.x = (d.width - imgWidth)/2;
		me.pos.y = d.height - imgHeight-5;
		me.pos.width = imgWidth;
		me.pos.height = imgHeight;
	}
	
	private void init_game() {
		// 크기 객체(Dimension)을 가지고 JPanel의 크기를 예약한다.
		p.setPreferredSize(d);
		
		// 크기가 예약된 JPanel을 현재 창 가운데에 추가
		this.add(p);
		
		current_stage = 1;
		life = MAX_LIFE;
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex1();
	}

}
