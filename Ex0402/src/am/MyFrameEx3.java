package am;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrameEx3 extends JFrame{

	JPanel panel;
	JLabel label;
	JTextField text;
	JButton btn;
	JTextArea area;
	
	public MyFrameEx3 () {
		label = new JLabel("URL:");
		text = new JTextField(20);
		btn = new JButton("확인");
		area = new JTextArea();
		panel = new JPanel();
		
		panel.add(label);
		panel.add(text);
		panel.add(btn);
		
		this.add(panel , BorderLayout.NORTH);
		this.add(area);
		
		this.setBounds(400, 300, 500, 600);
		this.setVisible(true);
		
		this.addWindowListener(new MyWinEx1());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrameEx3();
	}

}
