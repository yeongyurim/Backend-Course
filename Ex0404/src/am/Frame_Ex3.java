package am;

import javax.swing.JFrame;

public class Frame_Ex3 extends JFrame {

	Canvas_Ex3 can;
	
	public Frame_Ex3() {
		can = new Canvas_Ex3();
		this.add(can);
		
		this.setBounds(200, 100, 600, 550);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 사용자가 캔버스 위에서 클릭할 때마다 이미지 객체를 생성한다.
		// 그러기 위해서 캔버스에 마우스 이벤트 감지자를 등록해야 한다.
		can.addMouseListener(new MyMouse_Ex3(this));
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex3();
	}

}
