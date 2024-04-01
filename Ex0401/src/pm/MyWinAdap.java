package pm;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWinAdap extends WindowAdapter {
	// WindowAdapter = WindowListener를 깡통으로 구현해놓은 클래스 
	// 재정의 해야 되는것은 없음
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	} 
	
	
}
