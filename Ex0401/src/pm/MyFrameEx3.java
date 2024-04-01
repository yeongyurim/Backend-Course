package pm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
// extends , implements = is a 관계라고도 한다.
public class MyFrameEx3 extends JFrame implements WindowListener {

	// 생성자는 반환형을 작성하지 않는다.
	public MyFrameEx3 () {
		// 기본 생성자
		// 생성자의 목적 : 멤버 변수들에 대한 초기화
		
		// 현재 객체 자체를 의미하는 키워드
		this.setSize(500, 600);
		this.setVisible(true);
		
		// 창의 X버튼을 클릭하는 것을 감지하는 이벤트 감지자 등록
		this.addWindowListener(this); // 객체 자료형이 매개변수로 존재할 시 그것을 상속하거나 구현한 객체들이 그 매개변수로 들어갈 수 있다.
		// 콜백함수, 콜백메소드 = 특정한 사건이 발생했을 때 자동으로 호출되는 함수를 말한다.
	}
	
	public static void main(String[] args) {
		MyFrameEx3 f = new MyFrameEx3(); // 생성자를 하나도 만들지 않을 경우 컴파일러가 자동적으로 인자가 없는 생성자를 하나 만들어준다.
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// X버튼을 클릭할 때마다 수행하는 곳
		System.exit(0); // 프로그램 종료 : 0 을 인수로 주어야 즉시 종료하라는 뜻이다.
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
