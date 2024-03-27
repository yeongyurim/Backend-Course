package am;

public class MultiForEx7 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int k=1; k<=4; k++) {
				System.out.printf("%-2d",k);
			} // 안쪽 for의 끝
			System.out.println(); // 줄바꿈
		} // 바깥쪽 for의 끝
	}

}
