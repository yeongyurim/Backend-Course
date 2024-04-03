package homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 동작을 감지하는 인터페이스 ActionListener를 구현한다.
public class LottoEx1 extends JFrame implements ActionListener {

	JPanel north_p, center_p;
	JButton bt;
	int[] ar;

	public LottoEx1() {
		// 화면 구성
		ar = new int[6];
		north_p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		north_p.add(bt = new JButton("생성"));
		
		// 버튼을 오른쪽 정렬로 배치한 north_p를
		// 현재 창의 North영역에 추가한다.
		this.add(north_p, BorderLayout.NORTH);
		
		// 현재 창의 가운데에 center_p를 생성하여 추가한다.
		this.add(center_p = new JPanel());
		
		this.setBounds(200, 100, 800, 250);
		this.setVisible(true);
		this.addWindowListener(new MyWin());
		
		bt.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new LottoEx1();
	}
	
	// ActionListener의 유일한 추상 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// 생성 버튼을 클릭할 때마다 수행하는 곳!
		
		// 배열을 생성하여 난수를 저장한다. 물론 중복체크까지 수행한다.
		setAr();
		setLabel(); // 난수가 모두 만들어진 배열을 가지고
		// ImageIcon 생성 후 JLabel생성하여
		// center_p에 추가하는 동작
	}
	
	private void setLabel() {
		// center_p에 JLabel을 그리기 전에 이미 center_p에 있는 
		// 내용을 모두 지워야 한다.
		center_p.removeAll();
		
		for(int i=0; i<ar.length; i++) {
			// String path = "src/images/"+ar[i]+".git";
			StringBuffer sb = new StringBuffer("src/images/");
			sb.append(ar[i]);
			sb.append(".gif");
			
			// 위의 경로를 가지고 ImageIcon을 생성하자
			ImageIcon icon = new ImageIcon(sb.toString());
			
			// 위의 ImageIcon을 가지고 JLabel을 생성하자
			JLabel lb = new JLabel(icon);
			
			// 위의 JLabel을 center_p에 추가
			center_p.add(lb);
		} // for의 끝
		center_p.revalidate();
		
	}
	// 외부에서의 호출을 금지하는 접근제한자.
	private void setAr() {
		// 배열은 생성자에서 생성되었으므로 생성할 필요는 없다.
		for(int i=0; i<ar.length; ) {
			// 1부터 45까지의 수들 중 난수 발생
			int r = (int)(Math.random() * 45 + 1);
			ar[i] = r;
			
			boolean chk = true;
			for(int j=0; j<i; j++) {
				if(ar[i] == ar[j]) {
					chk = false;
				}
			} // 중복체크 반복문의 끝
			
			if(chk)
				++i;
		}
	}
}
