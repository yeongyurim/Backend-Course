package pm;

import javax.swing.JFrame;

public class MyFrameEx5 extends JFrame {
	
	MyWinAdap mw;
	
	public MyFrameEx5() {
		
		this.setSize(500, 600); // 창의 크기를 지정해 주는 메소드
		// 왼쪽 상단의 좌표는 (0,0)이다.
		this.setLocation(450, 300); // 창의 위치 설정
		this.setVisible(true);
		
		mw = new MyWinAdap();
		this.addWindowListener(mw);
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrameEx5();
	}

}
