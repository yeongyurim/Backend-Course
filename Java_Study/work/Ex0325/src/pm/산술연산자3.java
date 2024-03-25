package pm;

public class 산술연산자3 { // 파일명과 class명이 동일해야한다.

	public static void main(String[] args) {
		// 산술 연산자 (+,-,*,/,%: 나머지 구하기)
		
		// 정수형 변수 a를 선언하면서 10을 저장하자
		int a = 10;
		
		// 정수형 변수 b를 선언하면서 7을 저장하자!
		int b = 7;
		
		// 정수형 변수 c를 선언하면서 변수 a와 변수 b를 더한 값을 저장하자!
		int c = a + b;
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("a + b = " + c);
		System.out.println("---------------");
		// 정수형 변수 d를 선언하면서 변수 a와 변수b를 곱한 값을 저장하자!
		int d = a*b;
		// 정수형 변수 e를 선언하면서 변수 a에 변수b를 나눈 값을 저장하자!
		int e = a/b;
		// 정수형 변수 f를 선언하면서 변수 a에 변수b를 나눈 나머지 값을 저장하자!
		int f = a%b;
		
		System.out.println("d:"+d);
		System.out.println("e:"+e); // .연산자 우선순위 높음
		System.out.println("f:"+f); // 10에 7로 나눈 나머지값 3
	}

}
