package pm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWin implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("열렸네!");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 창의 X버튼을 클릭할 때마다 수행하는 곳 -> 콜백함수
		System.exit(0); // 즉시 종료해라.
		System.out.println("end");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
