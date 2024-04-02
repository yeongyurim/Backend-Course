package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import am.MyWinEx1;

public class MyFrameEx6 extends JFrame implements ActionListener{

	JLabel[] lbs;
	JButton btn;
	JPanel p1, p2;
	
	int [] lotto = new int[6];
	
	public MyFrameEx6 () {
		lbs = new JLabel[6];
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2 = new JPanel();
		btn = new JButton("생성");
		
		p1.add(btn);
		this.add(p1, BorderLayout.NORTH );
		for(int i=0; i<lbs.length; i++) {
			lbs[i] = new JLabel();
			p2.add(lbs[i]);
		}
		this.add(p2);
		
		this.addWindowListener(new MyWinEx1());
		btn.addActionListener(this);
		this.setBounds(300, 200, 500, 350);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrameEx6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setRandomNumbers();
		for(int i=0; i<lbs.length; i++) {
			StringBuffer src = new StringBuffer("src/images/");
			src.append(lotto[i]);
			src.append(".gif");
			ImageIcon icon = new ImageIcon(src.toString());
			// 생성된 이미지 아이콘을 lb1 생성할 때 넣어준다.
			lbs[i].setIcon(icon);
		}
	}
	
	public void setRandomNumbers() {
				
		for(int i=0; i<6;) {
			lotto[i] = (int)(Math.random()*45+1);
			boolean abundanted = false;
	
			for (int j=0; j<i; j++) { // i보다 작은 index 만큼
				if (lotto[i] == lotto[j]) {
					abundanted = true;
					break;
				}
			}
					
			if (!abundanted)
				i++;
		}
	}
}
