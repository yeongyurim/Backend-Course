package pm;

public class BreakEx2 {

	public static void main(String[] args) {
		// 프로그램 시작
		/*
		 	1 2 3 4 5
		 	1 2 3 4 5
		 	1 2 3 4 5
		 */
		for(int i=0; i<3; i++) {
			for(int k=1; k<=5; k++) {
				System.out.printf("%2d",k);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		/*
		 1 2 3
		 1 2 3
		 1 2 3
		 */
		
		for(int i=0; i<3; i++) {
			for(int k=1; k<=5; k++) {
				if(k>2)
					break; // 가장 가까운 반복문 탈출
				System.out.printf("%2d",k);
			}
			System.out.println();
		}
		
	}

}
