package ch05.exam;

public class MultiDimensionalArrayHandling {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0, count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[i].length; k++) {
				sum += array[i][k];
				count++;
			}
		}
		
		System.out.println("sum: "+sum+" Avg: "+sum/count);
	}

}
