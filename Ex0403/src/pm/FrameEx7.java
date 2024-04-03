package pm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class FrameEx7 extends JFrame 
implements MouseListener {

	Canvas_Ex7 can;
	
	public FrameEx7() {
		can = new Canvas_Ex7();
		
		this.add(can);
		
		this.setBounds(300, 150, 600, 600);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 이벤트 감지자 등록
		can.addMouseListener(this);
	}
	public static void main(String[] args) {
		new FrameEx7();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// 클릭한 x, x좌표를 얻어낸다.
		int x = e.getX();
		int y = e.getY();
		
		MyOval mo = new MyOval(x, y);
		
		// 생성된 타원 객체를 canvas_ex7안에 있는 list에 저장
		can.list.add(mo);
		
		// 캔버스를 다시 그린다.
		can.repaint(); // --> update() --> paint() 
					   //     지우는 역할      그리는 역할
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
