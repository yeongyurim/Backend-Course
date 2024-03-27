package am;

public class WhileEx2 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		/*
		 *  while문의 구성
		 *  
		 *  while(조건식) {
		 *  	실행문1;
		 *  	실행문2; // 조건식을 불만족 시킬 수 있도록 하는 증감식
		 *  // while문의 끝
		 *  
		 *  1~10까지 반복하는 while문을 구현해 보자!
		 */
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}	
	}

}
