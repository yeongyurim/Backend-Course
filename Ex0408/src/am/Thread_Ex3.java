package am;

public class Thread_Ex3 {

	public static void main(String[] args) {
		Runnable_Ex3 rx = new Runnable_Ex3();
		
		Thread t1 = new Thread(rx, "형님");
		Thread t2 = new Thread(rx, "아우");
		t1.start();
		t2.start();
	}

}
