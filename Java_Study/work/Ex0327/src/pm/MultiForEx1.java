package pm;

public class MultiForEx1 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		/*
		 	[결과]
		 	*
		 	**
		 	***
		 	****
		 	*****
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("%-2s", "*");
			} // 열을 반복하는 for문의 끝
			System.out.println(); // 줄바꿈
		} // 행을 반복하는 for문의 끝
		
		System.out.println("------------------------------------");
		
		/*
	 	[결과]
	 		*****
	 		****
	 		***
	 		**
	 		*
	 	*/
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.printf("%-2s", "*");
			} // 열을 반복하는 for문의 끝
			System.out.println(); // 줄바꿈
		} // 행을 반복하는 for문의 끝
	}

}
