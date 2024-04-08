package pm;

import java.awt.Rectangle;

public class Meteor extends Thread {
	// 운석을 의미하는 클래스
	Rectangle meteor_pos = new Rectangle();
	int life;
	int speed;
	
	// 종료 flag
	boolean flag = false;
	
	// 현재 운석 객체는 Frame정보를 가지고 있어야 한다.
	// 이유는 그곳에 있는 ArrayList과 JPanel등을 접근해야 한다.
	Frame_Ex1 frame;
	
	public Meteor (Frame_Ex1 frame) {
		this.frame = frame;
		
		meteor_pos.x = (int) (Math.random()* (frame.d.width-frame.me.pos.width));
		meteor_pos.y = - frame.meteor_img.getHeight(frame);
		meteor_pos.width = frame.meteor_img.getWidth(frame);
		meteor_pos.height = frame.meteor_img.getHeight(frame);
		
		speed = (int)(Math.random()*5+1+frame.current_stage);
		life = 1 + frame.current_stage;
	}
	
	@Override
	public void run() {
		// flag에 따라 무한 반복 탈출
		while(true) {
			
			meteor_pos.y += 3;
			frame.p.repaint();
			// 주인공 객체와 충돌여부 확인
			if(meteor_pos.intersects(frame.me.pos)) {
				if(frame.life-- <= 0)
					System.exit(0);
				flag = true;
			}
			// 총알 객체와 총돌여부 확인
			for(int i=0; i<frame.bullets.size(); i++) {
				if(meteor_pos.intersects(frame.bullets.get(i).bullet_pos)) {
					if(--life <= 0 )
						flag = true;
					frame.bullets.get(i).flag = true;
				}
			}
			// 화면 하단 도달여부 확인
			if(meteor_pos.y==frame.d.height)
				flag = true;
			
			// 운석 폭발 조건 확인
			if(flag)
				break;
			try {
				Thread.sleep(speed);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		frame.meteors.remove(this);
	}
}
