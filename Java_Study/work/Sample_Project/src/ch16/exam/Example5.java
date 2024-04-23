package ch16.exam;

public class Example5 {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	private static double avg(Function2 <Student> func) {
		double avg = 0;
		int sum = 0;
		for(Student student : students) {
			sum += func.apply(student);
		}
		avg = (double)sum/students.length;
		return avg;
	}
	public static void main(String[] args) {
		//double englishAvg = avg( s-> s.getEnglishScore() );
		//System.out.println("영어 평균 점수: " + englishAvg);
		double englishAvg = avg(Student :: getEnglishScore);
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s-> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
