package am;

public class 삼항연산자3 {

	public static void main(String[] args) {
		// 조건 연산자의 구성
		// (조건식)? true시 : false시
		// if문보다 속도가 더 빠르다!
		int a = 10;
		int b = 7;
		
		String c = (a==b)?"a가 크다.":"a가 크지 않다.";
		System.out.println(c);
	}

}
