package am;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame_Ex4 extends JFrame implements KeyListener{
	public Frame_Ex4() {
		this.setBounds(300, 100, 500, 500);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex4();
	}

	// 추상 메소드가 2개 이상이면 Adapter 클래스가 제공된다.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키보드를 눌렀을 때
		// e.getKeyChar() 누른 키보드 문자를 가져다 줌
		int code = e.getKeyCode();
		char ch = e.getKeyChar();
		
		this.setTitle(code+ ":" +ch);
		// VK_LEFT = 방향키 -> = 37
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
