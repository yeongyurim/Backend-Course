package ch05.exam;

public class MaxFinder {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		
		int max = 0;
		for(int i = 0; i < array.length; i ++) {
			if( array[i] > max )
				max = array[i];
		}
		System.out.println(max);
	}

}
