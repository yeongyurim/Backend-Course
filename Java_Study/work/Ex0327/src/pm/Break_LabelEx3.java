package pm;

public class Break_LabelEx3 {
	public static void main(String[] args) {
		// lebel은 오로지 반복문 앞에만 붙일 수 있다.
		bk : for(int i=0; i<3; i++) {
			for(int k=1; k<=5; k++) {
				System.out.printf("%2d",k);
				if(k>2)
					break bk; // bk label이 붙여진 반복문 탈출
			}
			System.out.println();
		}
	}
}
