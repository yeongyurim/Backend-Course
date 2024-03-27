package pm;

public class ForEx9 {

	public static void main(String[] args) {
		// 2-9 사이의 난수를 얻어내어 
		// 다음 보기와 같은 구구단을 출력하자!
		/*
		 [보기]
		 3단
		 --------
		 3*1=
		 3*2=
		 3*3=
		 3*4=
		 3*5=
		 3*6=
		 3*7=
		 3*8=
		 3*9=
		 */
		int randomNumber = (int)(Math.random()*8+2);
		
		System.out.printf("%d단\n",randomNumber);
		System.out.println("----------");
		for(int i=1; i<10; i++) {
			System.out.printf("%-2d*%2d =%3d\n",randomNumber,i,randomNumber*i);
		}
		

	}

}
