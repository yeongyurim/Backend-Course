package am;

public class MultiForEx9 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int k=0; k<5; k++) {
				System.out.printf("%-3c",(int)'A'+k+(i*4));
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for(int i=0; i<3; i++) {
			for(int k=0; k<5; k++) {
				System.out.printf("%2c",'*');
			}
			System.out.println();
		}
		
	}

}
