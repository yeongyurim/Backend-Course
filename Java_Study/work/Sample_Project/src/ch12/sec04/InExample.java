package ch12.sec04;

/*
 * 48 = 0
 * 57 = 9
 * 
 * 65 = A
 * 90 = Z
 * 
 * 97 = a
 * 122 = z
 */
public class InExample {

	public static void main(String[] args) throws Exception {
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			// Enter 키를 읽지 않았을 경우에만 실행
			if (keyCode != 13 && keyCode != 10) {
				if (keyCode == 49 ) {		// 숫자 1 키를 읽었을 경우
					speed++;
				} else if (keyCode == 50) { 	// 숫자 2 키를 읽었을 경우
					speed--;
				} else if (keyCode == 51) {		// 숫자 3 키를 읽었을 경우
					break;
				}
				System.out.println("---------------------");
				System.out.println("1. 증속| 2. 감속| 3. 중지");
				System.out.println("---------------------");
				System.out.println("현재속도=" + speed);
				System.out.println("선택: ");
			}
			
			// 키를 하나씩 읽음
			keyCode = System.in.read(); // 호출과 동시에 키 코드를 읽는 것이 아니라, enter키를 누르기 전까지는 대기 상태이다가
			// enter키를 누르면 입력했던 키들을 하나씩 읽기 시작한다. 
			// 단, read() 메소드는 IO Exception을 방생할 수 있는 코드이므로 예외처리가 필요하다.
		}
		
		System.out.println("프로그램 종료");
	}

}
