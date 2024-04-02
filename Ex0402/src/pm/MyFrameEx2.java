package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import am.MyWinEx1;

public class MyFrameEx2 extends JFrame implements ActionListener {
	JPanel p1;
	JTextField input;
	JButton bt;
	JTextArea ta;
	
	public MyFrameEx2() {
		// flowlayout의 기본 정렬은 가운데 정렬임
		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		input = new JTextField(10);
		bt = new JButton("확인");
		ta = new JTextArea();
		this.add(new JScrollPane(ta));
	
		p1.add(input);
		p1.add(bt);
		
		this.add(p1, BorderLayout.NORTH);
		this.add(ta);
		
		this.setBounds(300, 100, 500, 450);
		this.setVisible(true);
		this.addWindowListener(new MyWinEx1());
		
		bt.addActionListener(this);
	} // 생성자의 끝
	
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrameEx2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// input안에 있는 문자열을 가져와서 JTextArea에 추가
		int a = Integer.parseInt(input.getText());
		for(int i = 1; i < 10; i++) {
			ta.append(a+" * "+i+" = "+a*i); // 문자열 객체가 너무 많이 생성되서 메모리 불량임
			ta.append("\n");
		}
	}

}
