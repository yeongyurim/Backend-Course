package am;

public class 대입연산자2 {

	public static void main(String[] args) {
		// 대입연산자(=:우측의 값을 좌측 변수에 저장
		//      += : 우측의 값을 좌측변수에 더하며 저장
		//      -= : 우측의 값을 좌측변수에 제하며 저장
		//      *= : 우측의 값을 좌측변수에 곱하며 저장
		//      /= : 우측의 값을 좌측변수에 나누며 저장
		//      %= : 우측의 값을 좌측변수에 나머지연산하여 저장
		int a = 10;
		int b = 7;
		a += b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
