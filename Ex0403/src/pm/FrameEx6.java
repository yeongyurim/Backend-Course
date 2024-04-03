package pm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class FrameEx6 extends JFrame 
implements MouseListener {

	Canvas_Ex6 can;
	
	public FrameEx6() {
		can = new Canvas_Ex6();
		
		this.add(can);
		
		this.setBounds(300, 150, 600, 600);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 이벤트 감지자 등록
		can.addMouseListener(this);
	}
	public static void main(String[] args) {
		new FrameEx6();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스를 누를 때마다 수행하는 곳
		// 얻어낸 X좌표를 can안에 있는 x에 저장!
		can.x = e.getX();
		can.y = e.getY();
		
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
