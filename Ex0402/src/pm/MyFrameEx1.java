package pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import am.MyWinEx1;

public class MyFrameEx1 extends JFrame implements ActionListener{

	JButton bt1, bt2, bt3;
	JPanel p1, p2;
	
	public MyFrameEx1 () {
		p1 = new JPanel();
		p2 = new JPanel();
		
		bt1 = new JButton("red");
		bt2 = new JButton("green");
		bt3 = new JButton("blue");
		
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		
		// 버튼 3개를 가지고 있는 p1을
		// 현재 창의 North 영역에 추가하자
		this.add(p1, BorderLayout.NORTH);
		this.add(p2);
		
		this.setBounds(300, 200, 500, 500);
		this.setVisible(true);
		this.addWindowListener(new MyWinEx1());
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrameEx1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생할때마다 호출되는 곳
		Object obj = e.getSource();
		if (obj == bt1)
			p2.setBackground(Color.red);
		else if (obj == bt2)
			p2.setBackground(Color.green);
		else
			p2.setBackground(Color.blue);
	}

}
