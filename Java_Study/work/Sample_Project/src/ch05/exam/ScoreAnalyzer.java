package ch05.exam;

import java.util.Scanner;

public class ScoreAnalyzer {

	public static void main(String[] args) {
		int mode = 0, students = 0, scores[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		while ( mode != 5) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-------------------------------------------");
			
			System.out.print("선택> ");
			mode = scanner.nextInt();
			
			if(mode != 1) {
				System.out.println("학생수를 먼저 입력해주시길 바랍니다!");
			}
			switch(mode) {
				case 1 -> {
					System.out.print("학생수> ");
					students = scanner.nextInt();
					scores = new int[students];
				}
				
				case 2 -> {
					for(int i = 0; i < students; i++) {
						System.out.print("score["+i+"]> ");
						scores[i] = scanner.nextInt();
					}					
				}
				
				case 3 -> {
					for(int i = 0; i < students; i++) {
						System.out.println("score["+i+"]>: "+scores[i]);
					}			
				}
				
				case 4 -> {
					int max = 0, sum = 0;
					for(int i = 0; i < students; i++) {
						if (scores[i] > max)
							max = scores[i];
						sum += scores[i];
					}
					System.out.println("최고 점수: "+max);
					System.out.println("평균 점수: "+(double)sum/scores.length);
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
