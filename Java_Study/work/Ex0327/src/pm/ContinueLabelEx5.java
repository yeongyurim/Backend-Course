package pm;

public class ContinueLabelEx5 {

	public static void main(String[] args) {
		// 레이블은 반복문 앞에서만 선언이 가능하다.
		num1: for(int i=1; i<=3; i++) {
			for(int k=1; k<=5; k++) {
				
				// i값을 출력하기 전에 i가 3의 배수이면
				// i값을 출력하지 않고, 다음 반복회차로 이동
				if(k%3 == 0)
					continue num1;
				System.out.printf("%-2d", k);
			} // 열을 반복하는 for문의 끝
			System.out.println(); 
		} // 행을 반복하는 for문의 끝
	}

}
