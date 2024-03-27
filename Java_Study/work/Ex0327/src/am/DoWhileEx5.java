package am;

public class DoWhileEx5 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// do~while의 구성
		/* do 두의 중괄호와 while 뒤의 세미콜론을 빼먹으면 안된다.
		 * do {
		 * 		반복할 실행문1;
		 * 		반복할 실행문2;
		 * } while (조건식);
		 */
		
		int i = 11;
		do {
			System.out.println(i++);
		} while(i <= 10);
		// do~while은 선처리, 후비교 이므로
		// 조건에 맞지 않아도 1번은 수행한다.
		
		System.out.println("--- 1~100까지의 합을 구하는 반복문 ---");
		
		// 위에서 선언한 i라는 변수를 다시 초기화 하여 사용하자!
		
		i = 1;
		int sum = 0;
		do {
			sum += i++;
		} while ( i<=100);
		
		System.out.printf("1~100까지의 합:%d", sum);
	}

}
