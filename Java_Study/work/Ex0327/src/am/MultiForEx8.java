package am;

public class MultiForEx8 {

	public static void main(String[] args) {
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		
		for(int i=0; i<3; i++) {
			for(int k=1; k<=4; k++) {
				System.out.printf("%-3d",k+(i*4));
			}
			System.out.println();
		}

	}

}
