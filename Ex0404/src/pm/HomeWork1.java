package pm;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeWork1 extends JFrame {

	int code;
	JButton[] jbs;
	JPanel jp;
	int layout;
	
	ActionListener al;
	
	public HomeWork1() {
		// ActionLister 무명 클래스 초기화
		al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if(obj.equals(jbs[0])) {
					jp.setLayout(new FlowLayout(FlowLayout.LEFT));
				} else if (obj.equals(jbs[2])) {
					jp.setLayout(new FlowLayout(FlowLayout.RIGHT));
				} else {
					jp.setLayout(new FlowLayout(FlowLayout.CENTER));
				}
				jp.revalidate();
			}
		};
		
		// JButton 배열 초기화
		jbs = new JButton[3];
		jbs[0] = new JButton("L"); 
		jbs[1] = new JButton("R"); 
		jbs[2] = new JButton("C"); 
		
		// JPanel 레이아웃 지정 및 초기화
		layout = FlowLayout.CENTER;
		jp = new JPanel(new FlowLayout(layout));
		
		// JButton 배열에 ActionListener 추가
		for(int i=0; i<jbs.length; i++) {
			jbs[i].addActionListener(al);
			jp.add(jbs[i]);
		}
		
		// JPanel JFrame에 추가
		this.add(jp, BorderLayout.NORTH);
		
		// JFrame 설정
		this.setBounds(300, 100, 400, 400);
		this.setVisible(true);
		
		// 윈도우 이벤트 감지자 등록
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료
			}
		});
	}
	public static void main(String[] args) {
		new HomeWork1();
	}

}
