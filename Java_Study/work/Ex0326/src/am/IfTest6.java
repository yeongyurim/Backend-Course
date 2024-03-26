package am;

public class IfTest6 {

	public static void main(String[] args) {
		// Class명은 대문자로 시작
		// 제어문 종류
		/*
		 *  - 비교문 (분기문)
		 *  	1) if문 : 단순 if문, if~else문, 다중if문
		 *  	2) switch문
		 *  - 반복문
		 *  	1) for문
		 *  	2) while문
		 *  	3) do~while문
		 *  - 탈출문
		 *  	break문
		 *  	continue문
		 */
		
		int su1 = 10;
		/*
		 *  [조건]
		 *  	su1의 값이 10이상이면 화면에 "10점 이상" 이라는 문자열을 출력하시오!
		 */
		if(su1>=10) {
			System.out.println("10점 이상!");
			System.out.println("입니다!");
		}
	}

}
