package ch14.sec03.exam02;

public class BeepPrintExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<5; i++) {
					System.out.println("삡");
					try { Thread.sleep(500); } catch(Exception e) {}
					}
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {} ;
		}
	}
}
