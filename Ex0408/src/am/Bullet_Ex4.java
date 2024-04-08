package am;

public class Bullet_Ex4 extends Thread {
	Frame_Ex4 frame;
	
	int x,y;
	int w=8, h=20;
	
	// 현재 객체가 총알을 의미하며, 현재 객체를 
	// 스페이스바가 눌려질 때마다 생성되어 Jframe의 멤버변수인
	// ArrayList에 저장되어야 한다. 즉, ArrayList를 접근할 때가 생긴다.
	// 그래서 ArrayList를 가지는 JFrame의 주소가 필요함!
	
	public Bullet_Ex4(Frame_Ex4 frame) {
		this.frame = frame;
		
		this.x = frame.x + 25 + 4;
		this.y = frame.y + 20;
	}

	@Override
	public void run() {
		// 일정 시간동안 쉬면서 y좌표를 감소시킨다.
		while(true) {
			y -= 3;
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				// TODO: handle exception
			}
			// 좌표값이 변경되었으므로 다시 그려야 한다.
			frame.p.repaint();
			// 현재 무한반복을 탈출하기 위한 비교문
			// (현재 총알 객체가 화면 위로 사라진 후)
			if(y < -20)
				break; 	// 무한반복 탈출과 함께 현재 객체를
						// 소멸시켜야 한다. (ArrayList에서 삭제)
		}
		// 삭제...
		frame.b_list.remove(this);
	}
}
