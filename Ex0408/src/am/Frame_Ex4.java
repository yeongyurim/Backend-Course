package am;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame_Ex4 extends JFrame {

	int x, y;// 상자의 위치
	
	// 사용자가 스페이스바를 누를 때마다 총알 객체를 생성하여 저장할 곳!
	ArrayList<Bullet_Ex4> b_list = new ArrayList<>();
	
	// 화면 가운데에 적용할 JPanel
	JPanel p = new JPanel() {
		@Override
		protected void paintComponent(Graphics g) {
			// 현재 p와 동일한 크기의 이미지 객체 생성
			Image buf = createImage(this.getWidth(), this.getHeight());
			
			// 준비된 buf라는 Image객체에만 그림을 그릴 수 있는
			// 붓과 같은 객체를 만든다.
			Graphics bufG = buf.getGraphics();
			
			bufG.fillRect(x, y, 70, 50); // 상자
			
			// 총알 그리기
			for(int i=0; i<b_list.size(); i++) {
				// 총알 객체를 b_list로부터 하나를 얻어낸다.
				Bullet_Ex4 b = b_list.get(i);
				bufG.fillRect(b.x, b.y, b.w, b.h);
			}
			
			// 이미지 객체에 그림을 다 그렸다. 이제 이미지 객체를 
			// 현재 JPanel의 0,0 위치에 넣어준다.
			g.drawImage(buf, 0, 0, this);
		}
	};
	
	public Frame_Ex4() {
		// 현재 창 가운데에 p를 넣어준다.
		this.add(p);
		
		this.setBounds(300, 100, 600, 500);
		this.setVisible(true);
		
		// 상자를 그릴 위치 값을 구하자
		x = p.getSize().width/2 -35;
		y = p.getSize().height - 90;
		p.repaint();
		
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
					case KeyEvent.VK_LEFT :
						x -= 10;
						p.repaint();
						break;
					case KeyEvent.VK_RIGHT :
						x += 10;
						p.repaint();
						break;
					// 스페이스 바를 누를 때마다 총알객체 생성
					case KeyEvent.VK_SPACE :
						Bullet_Ex4 bullet = new Bullet_Ex4(Frame_Ex4.this);
						bullet.start();
						b_list.add(bullet);
						break;
				};
			}
		});
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex4();
	}

}
