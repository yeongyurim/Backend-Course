package am;

public class WhileEx4 {

	public static void main(String[] args) {
		// 1-45 자리 난수
		int i = 0;
		while(i<6) {
			System.out.print((int)(Math.random()*45+1)+" "); i++;
		}
	}

}
