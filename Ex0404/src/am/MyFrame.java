package am;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyCanvas can;
	
	public MyFrame() {
		can = new MyCanvas();
		this.add(can);
		
		this.setBounds(100, 100, 600, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		can.addMouseListener(new MyMouse(this));
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
