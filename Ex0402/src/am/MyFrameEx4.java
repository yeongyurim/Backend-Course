package am;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrameEx4 extends JFrame{
	
	JCheckBox cb1, cb2, cb3, cb4;
	JPanel p1;
	JTextArea ta;
	GridLayout gl;
	public MyFrameEx4 () {
		gl = new GridLayout(5, 1);
		p1 = new JPanel(gl);
		
		cb1 = new JCheckBox("항목1");
		cb2 = new JCheckBox("항목2");
		cb3 = new JCheckBox("항목3");
		cb4 = new JCheckBox("항목4");
		
		// 생성된 체크 박스들을 p1에 추가하자!
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		
		this.add(p1, BorderLayout.WEST);
		this.add(ta = new JTextArea());;
		
		this.setBounds(300, 150, 500, 400);
		this.setVisible(true);
		this.addWindowListener(new MyWinEx1());
	}
	public static void main(String[] args) {
		new MyFrameEx4();
	}
}
