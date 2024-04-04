package pm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;

public class Frame_Ex3 extends JFrame {

	ArrayList<Oval_Ex3> list = new ArrayList<>();
	
	Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			// 클릭할 때마다 타원 객체가 list에 저장되므로
			// list의 크기만큼 반복하여 그림을 그리면 된다.
			Iterator<Oval_Ex3> i = list.iterator();
			while(i.hasNext()) {
				Oval_Ex3 j = i.next();
				g.setColor(j.c);
				g.fillOval(j.x, j.y, j.wh, j.wh);
			}
		}
	};
	
	public Frame_Ex3() {
		
		this.add(can);
		this.setBounds(200, 100, 500, 500);
		this.setVisible(true);
		
		// 종료 이벤트
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		can.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				list.add(new Oval_Ex3(e.getX(), e.getY()));
				
				can.repaint();
			}
		});
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex3();
	}

}
