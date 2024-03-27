package ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		// 배열 항목 초기값 출력
		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			for (int k = 0; k < mathScores[i].length; k++) { // 해당 반의 학생 수만큼 반복
				
				System.out.println("mathScores[" + i + "][" + k + "] " + mathScores[i][k]);
			}
		}
		System.out.println();
		
		// 각 반의 학생들에게 60-100 사이의 랜덤한 점수 부여
		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			for (int k = 0; k < mathScores[i].length; k++) { // 해당 반의 학생 수만큼 반복
				
				mathScores[i][k] = (int)(Math.random()*40+60);
			}
		}
		System.out.println();
		
		// 랜덤한 점수 부여 확인
		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			for (int k = 0; k < mathScores[i].length; k++) { // 해당 반의 학생 수만큼 반복
				
				System.out.println("mathScores[" + i + "][" + k + "] " + mathScores[i][k]);
			}
		}
		System.out.println();
		
		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i = 0; i < mathScores.length; i++) { //반의 수만큼 반복
			totalStudent += mathScores[i].length;		// 반의 학생 수 합산
			for (int k = 0; k < mathScores[i].length; k++) {// 해당 반의 학생 수 만큼 반복
				totalMathSum+= mathScores[i][k]; 		// 해당 점수 합산
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수 " + totalMathAvg);
		System.out.println();
		
		// 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		// 배열 항목 초기값 출력
		for (int i = 0; i < englishScores.length; i++ ) {
			for (int k =0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
			}			
		}
		
		// 각 반의 학생들에게 60-100 사이의 랜덤한 점수 부여
		for (int i = 0; i < englishScores.length; i++) { // 반의 수만큼 반복
			for (int k = 0; k < englishScores[i].length; k++) { // 해당 반의 학생 수만큼 반복
					
				englishScores[i][k] = (int)(Math.random()*40+60);
			}
		}
		System.out.println();
		
		// 랜덤한 점수 부여 확인
		for (int i = 0; i < englishScores.length; i++) { // 반의 수만큼 반복
			for (int k = 0; k < englishScores[i].length; k++) { // 해당 반의 학생 수만큼 반복			
				System.out.println("englishScores[" + i + "][" + k + "] " + englishScores[i][k]);
			}
		}
		
		// 전체 학생의 영어 평균 구하기
		totalStudent = 0;
		int totalEnglishSum = 0;
		for (int i = 0; i < englishScores.length; i++) { // 반의 학생 수만큼 반복
			totalStudent += englishScores[i].length;	 // 반의 학생 수 합산
			for (int k = 0; k < englishScores[i].length; k++) { // 해당 반의 학생 수
																// 만큼 반복
				totalEnglishSum += englishScores[i][k]; // 학생 점수 합산
			}
		}
		
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent; // 정수형 나눗셈시 소수점이 잘려서 출력되기 때문에 casting 해줌
		System.out.println("전체 학생의 영어 편균 점수: " + totalEnglishAvg);
	}

}
