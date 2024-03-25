package pm;

public class 비교연산자4 {

	public static void main(String[] args) {
		// 비교연산자 (관계연산자)
		// 프로그래밍에서 연산자를 중심으로 왼쪽이 기준이다.
		// > : 크다
		// < : 작다
		// >=: 크거나 같다
		// <=: 작거나 같다
		// ==: 같다
		// !=: 같지 않다.
		// 비교연산자의 결과는 무조건 true 혹은 false이다.
		// 한마디로 결과의 자료형이 boolean형이다.
		
		// 정수형 변수 a를 선언하면서 10을 저장하자!
		int a = 10;
		
		// 정수형 변수 b를 선언하면서 7을 저장하자!
		int b = 7;
		
		boolean res = a>b; // 대입연산자의 우선순위가 가장 낮다.
		
		System.out.println("res:"+res);

		// res라는 변수는 이미 앞에서 선언했던 변수다. 이것을
		// 다시 활용하여 다른 연산의 결과를 저장하자!
		
		res = a==b;
		System.out.println("res:"+res);
	}

}
