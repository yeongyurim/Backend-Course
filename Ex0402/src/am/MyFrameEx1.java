package am;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
// JFrame 의 5개 영역을 border layout이라 하며 구역당 하나의 컴포넌트만 넣을 수 있다.
public class MyFrameEx1 extends JFrame {
	
	// 멤버변수 선언!!!
	JButton bt1, bt2;
	
	public MyFrameEx1 () {
		// 생성자의 목적 멤버변수들에 대한 초기화
		
		// 원하는 버튼객체 생성
		bt1 = new JButton("버튼1");
		bt2 = new JButton("버튼2");
		this.setSize(500,600);
		this.setLocation(350, 300); // 창의 위치설정
		this.setVisible(true);
		
		// 현재 창에 버튼객체를 배치(추가)한다.
		this.add(bt1, BorderLayout.NORTH);
		this.add(bt2);
		
		// 종료이벤트 감지자 등록
		this.addWindowListener(new MyWinEx1());
	}
	public static void main(String[] args) {
		// 프로그램 시작
		MyFrameEx1 f = new MyFrameEx1();
	}

}
