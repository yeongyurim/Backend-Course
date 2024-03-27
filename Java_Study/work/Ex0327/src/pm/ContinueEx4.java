package pm;

public class ContinueEx4 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for(int i=1; i<=3; i++) {
			for(int k=1; k<=5; k++) {
				
				// i값을 출력하기 전에 i가 3의 배수이면
				// i값을 출력하지 않고, 다음 반복회차로 이동
				if(k%3 == 0)
					continue;
				System.out.printf("%-2d", k);
			} // 열을 반복하는 for문의 끝
			System.out.println();
		} // 행을 반복하는 for문의 끝
	}

}
