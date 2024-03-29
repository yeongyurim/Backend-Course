package homework;

import java.util.Scanner;

// 매개변수의 다형성에서 실제로 어떤 객체가 매개값으로 제공되었는지 확인하는 방법이 있다.
// 꼭 매개변수가 아니더라도 변수가 참조하는 객체의 타입을 확인하고자 할 때, instance of 연산자를 사용할 수 있다.
// boolean result = 객체 instanceof 타입
public class Main {
	public static void main(String[] args) {
		// 프로그램 시작부분
		
		// 자판기(Vending) 객체 생성
		Vending vending = new Vending();
		vending.init();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액:");
		int m = scanner.nextInt();
		String msg = vending.insertCoin(m);
		System.out.println(msg);
		// 자판기에게 금액을 넣어서 
		// 선택할 수 있는 음료의 이름들을 반환받아야 한다.
	}
}
