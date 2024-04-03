package am;

import java.util.Scanner;


public class ExceptionEx1 {

	public static void main(String[] args) {
		// 예외 (Exception)는 예상하지 못한 가벼운 오류를 의미하며
		// 프로그래머에 의해 수정이 가능한 것
		// 예외처리는 try~catch블럭으로 해결한다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수1: ");
		int su1 = scanner.nextInt();
		
		System.out.println("수2: ");
		int su2 = scanner.nextInt();
		
		// 예외 발생 가능한 영역
		try {
			System.out.println("su1/su2:"+(su1/su2));
		} catch (ArithmeticException e) {
			// ArithmethicException이 발생했을 때만 수행하는 곳!
			su2 = 1;
			System.out.println("예외발생 처리:" +(su1/su2));
		}
		
		System.out.println("프로그램 끝!");
	}

}
