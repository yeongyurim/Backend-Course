package ch12.exam;

public class Nanos {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int [] scores = new int[1000];
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long time = System.nanoTime() - startTime;
		System.out.println(time);
		
		double time2 = time/Math.pow(10, 9);
		System.out.println(time2);
	}

}
