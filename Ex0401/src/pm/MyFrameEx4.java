package pm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class MyFrameEx4 extends JFrame {

	MyWin  mw;
	public MyFrameEx4() {
		// 생성자는 멤버 변수들에 대한 초기화 역할을 담당한다.
		this.setSize(500, 600);
		this.setVisible(true);
		
		// 창 닫기 이벤트 감지자 등록
		// windowListener를 구현한 객체의 주소를 입력해주어야 한다.
		// 이벤트 리스너는 콜백이 발생할 때마다 매개변수로 온 객체를 반복적으로 재생성하게 된다.
		// 비효율적인 행동을 제어하기 위행 멤버 변수로 설정하여 준다.
		mw = new MyWin();
		this.addWindowListener(mw);
	}
	
	public static void main(String[] args) {
		MyFrameEx4 f = new MyFrameEx4();
	}
}
