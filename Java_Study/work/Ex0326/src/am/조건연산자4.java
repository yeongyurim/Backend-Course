package am;

import java.util.Scanner;

public class 조건연산자4 {

	public static void main(String[] args) {
		// 키보드로부터 정수 하나를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		// 준비된 키보드와 연결된 스캐너를 통해 숫자 하나를 받는다.
		int su1 = scanner.nextInt();
		
		String a = (su1<100)? "적절한 값" : "잘못된 값";
		System.out.println(a);
	}

}
