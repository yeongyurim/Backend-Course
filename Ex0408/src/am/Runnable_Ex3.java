package am;
// 스레드는 독립된 최소 실행 단위이다.
// 특정한 상황에서는 같은 자원을 공유해야 할 때가 있는데
public class Runnable_Ex3 implements Runnable {

	int 농심라면 = 10;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		while(농심라면 > 0) {
			synchronized (this) {
				// 교착상태(DeadLock)
				if(false)
					notify(); // 잠든 스레드를 깨운다.
				
				농심라면--;
				System.out.printf("--[%s] 먼저(농심라면:%d)\n",
						name, 농심라면);
				
				try {
					wait(); // 대기, 누군가가 깨우기 전까지 무조건 대기
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}
