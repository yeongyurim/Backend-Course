package pm;

import java.awt.Rectangle;

public class Bullet extends Thread {
	Frame_Ex1 frame;
	Rectangle bullet_pos;
	
	boolean flag = false;
	
	public Bullet(Frame_Ex1 frame) {
		bullet_pos = new Rectangle();
		
		this.frame = frame;
		bullet_pos.width = 8;
		bullet_pos.height = 20;
		bullet_pos.x = frame.me.pos.x + frame.me.pos.width/2 - bullet_pos.width/2;
		bullet_pos.y = frame.me.pos.y + bullet_pos.height;
	}

	@Override
	public void run() {
		// 일정 시간동안 쉬면서 y좌표를 감소시킨다.
		while(true) {
			bullet_pos.y -= 5;
			// 총알 천장 도달 여부
			if(bullet_pos.y <= - bullet_pos.height)
				flag = true;
			// 소멸 조건 달성 여부
			if(flag)
				break;
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
			frame.p.repaint();
		}
		frame.bullets.remove(this);
	}
}
