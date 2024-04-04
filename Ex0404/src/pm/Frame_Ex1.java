package pm;

import javax.swing.JFrame;

public class Frame_Ex1 extends JFrame {

	Canvas_Ex1 can;
	
	public Frame_Ex1() {
		can = new Canvas_Ex1();
		this.add(can);
		
		this.setBounds(100, 100, 500, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		can.addKeyListener(new MyKey_Ex1(this));
	}
	public static void main(String[] args) {
		new Frame_Ex1();
	}

}
