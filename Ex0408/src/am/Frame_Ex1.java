package am;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Frame_Ex1 extends JFrame {

	JProgressBar redBar, greenBar, blueBar;
	
	// 수행상태
	boolean bRed = true, bGreen = true, bBlue = true;
	
	// 스레드 내부 클래스들 준비
	Thread t_red = new Thread() {
		@Override
		public void run() {
			// redBar를 구동하는 Thread
			while(true) {
				// redBar의 값을 먼저 얻어낸다.
				int val = redBar.getValue();
				val++; // 값 증가
				
				if(val > 100)
					val = 0; // break;
				
				redBar.setValue(val); // 다시 값 지정!
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// 혹시 오류나면, 오류 내용을 순차적으로 출력하자!
					e.printStackTrace();
				}
			} // 무한 반복
		}
	};
	
	// 스레드 내부 클래스들 준비
	Thread t_green = new Thread() {
		@Override
		public void run() {
			// redBar를 구동하는 Thread
			while(true) {
				// redBar의 값을 먼저 얻어낸다.
				int val = greenBar.getValue();
				val++; // 값 증가
				
				if(val > 100)
					val = 0; // break;
				
				greenBar.setValue(val); // 다시 값 지정!
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					// 혹시 오류나면, 오류 내용을 순차적으로 출력하자!
					e.printStackTrace();
				}
			} // 무한 반복
		}
	};
	
	// 스레드 내부 클래스들 준비
	Thread t_blue = new Thread() {
		@Override
		public void run() {
			// redBar를 구동하는 Thread
			while(true) {
				// redBar의 값을 먼저 얻어낸다.
				int val = blueBar.getValue();
				val++; // 값 증가
				
				if(val > 100)
					val = 0; // break;
				
				blueBar.setValue(val); // 다시 값 지정!
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// 혹시 오류나면, 오류 내용을 순차적으로 출력하자!
					e.printStackTrace();
				}
			} // 무한 반복
		}
	};
	
	public Frame_Ex1() {
		// 현재 창의 레이아웃을 3행 1열의 그리드 레이아웃으로 설정
		this.setLayout(new GridLayout(3, 1));
		this.add(redBar = new JProgressBar(0, 100));
		this.add(greenBar = new JProgressBar(0, 100));
		this.add(blueBar = new JProgressBar(0, 100));
		
		redBar.setForeground(Color.RED); // 전경색 지정
		redBar.setValue(40); // 값 설정
		
		greenBar.setForeground(Color.GREEN); // 전경색 지정
		greenBar.setValue(20); // 값 설정
		
		blueBar.setForeground(Color.BLUE); // 전경색 지정
		blueBar.setValue(50); // 값 설정
		
		this.setBounds(300, 100, 500, 200);
		this.setVisible(true);
		
		// 준비된 스레드들 구동 시작
		t_red.start();
		t_green.start();
		t_blue.start();
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료
			}
		});
		
		// 키보드 이벤트 감지자 등록
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 키를 누를 때마다 수행하는 곳
				int code = e.getKeyCode();
				
				// r키를 눌렀을 때 redBar를 멈추고 다시 구동시킨다.
				switch (code) {
				case KeyEvent.VK_R: 
					// 토글 방식 : true <--> false
					bRed = !bRed;
					if(bRed) // bRed일때 true일 때 재시작
						t_red.resume();
					else
						t_red.suspend(); // 대기(일시정지)
					break;
				
				case KeyEvent.VK_G: 
					// 토글 방식 : true <--> false
					bGreen = !bGreen;
					if(bGreen) // bRed일때 true일 때 재시작
						t_green.resume();
					else
						t_green.suspend(); // 대기(일시정지)
					break;
					
				case KeyEvent.VK_B: 
					// 토글 방식 : true <--> false
					bBlue = !bBlue;
					if(bBlue) // bRed일때 true일 때 재시작
						t_blue.resume();
					else
						t_blue.suspend(); // 대기(일시정지)
					break;
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + code);
				}
			} // switch문의 끝
		});
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex1();
	}

}
