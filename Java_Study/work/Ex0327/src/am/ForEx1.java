package am;

public class ForEx1 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 본 예제는 반복문 for에 대한 연습예제이다.
		// 총 6번 반복하면서 1~45까지의 수들 중 난수를 발생시켜보자!
		for(int i=0; i<6; i++) {
			// 1) 1~45까지의 수들 중 난수 발생
			int r = (int)(Math.random()*45 + 1);
			System.out.print(r+" ");
		}
		// double Math.random() * 범위 + 시작값 

	}

}
