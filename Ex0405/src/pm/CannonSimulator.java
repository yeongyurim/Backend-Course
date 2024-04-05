package pm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CannonSimulator extends JFrame{

	JPanel panel;
	int surface = 350;
	
	Cannon cannon;
	
	public CannonSimulator() {
		cannon = new Cannon(50,surface,30,20,10);
		panel = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// 현재 JPanel의 크기와 같은 이미지 객체 생성
				Image buff = createImage(this.getWidth(), this.getHeight());
				
				// 준비된 이미지 객체에만 그림을 그릴 수 있는 붓
				Graphics buff_g = buff.getGraphics();
				buff_g.setColor(Color.GREEN);
				buff_g.fillRect(0, surface, this.getWidth(), this.getHeight());
				
				buff_g.setColor(Color.BLACK);
				Cannon.Wheel wheel = cannon.wheel1;
				buff_g.fillOval(wheel.x, wheel.y, wheel.width, HEIGHT);
				
				g.drawImage(buff, 0, 0, this);
			}
		};
		
		this.add(panel);
		this.setBounds(100,300,1000,500);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new CannonSimulator();
	}
}
