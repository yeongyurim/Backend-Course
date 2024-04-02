package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import am.MyWinEx1;

public class MyFrameEx3 extends JFrame implements ActionListener {

	JPanel p1;
	JTextField input;
	JButton bt;
	JTextArea ta;
	
	public MyFrameEx3() {
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
		input.addActionListener(this);
	} // 생성자의 끝
	
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrameEx3();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 먼저 input안에 있는 값을 가져온다.
		String str = input.getText().trim();
		
		// 사용자가 입력한 문자열 str에 문자가 있는지? 판단하는 반복문!
		boolean chk = false;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch <'0' || ch > '9') {
				// 문자인 경우
				chk = true;
				break; // 가장 가까운 반복문 탈출!
			}
		} // 문자 체크 반복문의 끝
		
		// chk가 true이면 str에 문자가 있는 경우다.
		if(chk) {
			JOptionPane.showMessageDialog(this, "문자가 있어 숫자로 변환할 수 없습니다.");
			return; // 제어권 반환!
		}
		
		// 가져온 값을 정수로 변경한다.
		int dan = Integer.parseInt(str);
		
		StringBuffer sb = new StringBuffer(dan + "단");
		sb.append("\r\n");
		sb.append("--------------------------\r\n");
		for(int i=1; i<10; i++) {
			sb.append(dan);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			sb.append("\r\n");
		}
		// textarea에 문자열로 설정
		ta.setText(sb.toString());
		// 임시 문자열 저장소를 통해 변경하여 변경 횟수를 적게 함
	}
	

}
