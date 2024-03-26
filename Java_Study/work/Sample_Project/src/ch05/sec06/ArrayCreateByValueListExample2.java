package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 배열 변수 선언 
		int[] scores; // 배열 선언 시 중괄호로 초기화 시키지 않은 경우 new 연산자를 이용해주어야 한다.
		
		// 배열 변수에 배열을 대입
		scores = new int[] {83, 90, 87};
		
		// 배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for(int i = 0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		// 배열을 매개값으로 주고, printItem() 메서드 호출
		// 메서드에 중괄호를 이용한 배열 매개값 전달시에도 new 연산자를 사용해주어야 한다.
		printItem( new int[] { 83, 90, 87} );

	}
	
	public static void printItem( int [] scores ) {
		// 매개변수가 참조하는 배열의 항목을 출력
		for(int i=0; i<3; i++) {
			System.out.println("score[" + i + "]:" + scores[i]);
		}
	}

}
