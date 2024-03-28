package pm;

public class LottoEx9 {

	public static void main(String[] args) {
		// 정수 6개를 저장하는 배열 생성
		int [] lotto = new int[6];
		
		boolean errorFlag = false;
		
		// 1~45까지의 수들 중 난수를 발생하여 lotto라는 배열에
		// 저장시킨다.
		// 중복이 되어서는 안된다.
		for(int k=0; k<1000; k++) {
			
			for(int i=0; i<6;) {
				lotto[i] = (int)(Math.random()*45+1);
				boolean abundanted = false;
				// 중복 체크
				for (int j=0; j<i; j++) { // i보다 작은 index 만큼
					if (lotto[i] == lotto[j]) {
						abundanted = true;
						break;
					}
				}
				// 중복이 안되면 넘긴다.
				if (!abundanted)
					i++;
			}
			/*
			 * 최소한의 기능만을 포함하게 코드를 짜주는 것이 좋다.
			 * 
			 */
			
			for(int i=0; i<6; i++) {
				System.out.print(lotto[i] + " ");
			}
			
			for(int i=0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(i==j) continue;
					if(lotto[i] == lotto[j])
						errorFlag = true;
				}
			}
			System.out.println();
		}
		System.out.println(errorFlag);
	}

}
