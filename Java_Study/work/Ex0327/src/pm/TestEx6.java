package pm;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 컴퓨터가 가지는 난수 발생 (1~100 중 하나만)
		int com = (int)(Math.random()*100+1);
		boolean againFlag = false;
		
		// 화면에 짝수는 1, 홀수는 2를 선택하도록 출력하자!
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("짝수:1, 홀수:2");
			int cmd = scanner.nextInt();
			
			switch(cmd) {
				case 1 : // 짝수를 선택시
					if(com%2==0)
						System.out.println("짝수가 맞았습니다!");
					else
						System.out.println("짝수가 아니었습니다!");
					break;
				case 2 :
					if(com%2!=0)
						System.out.println("홀수가 맞았습니다!");
					else
						System.out.println("홀수가 아니었습니다!");
					break;
				default:
					System.out.println("1아니면 2 둘 중 하나를 입력하세요");
			}
			System.out.println("com: "+com);
			
			System.out.print("다시 하시겠습니까? (Y/N)> ");
			// 자바에는 char 하나만 입력받는 기능이 없음
			againFlag = ((int)scanner.next().charAt(0) == (int)'Y')? true : false;
		}
		while (againFlag);
		System.out.println("게임을 종료합니다...");
		// 배열 주소는 인덱스를 제외하고는 연결성이 없다.
	}

}
