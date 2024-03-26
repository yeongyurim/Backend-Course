package ch04.sec03;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		char grade = 'b';
		
		//  Expressions 가 사용된 switch문 Java 12 이후부터 사용가능하다.
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손닙입니다.");
			}
		}
		
		// 중괄호 내 실행문이 하나만 있는 경우에는 중괄호를 생략할 수 있다.
		switch(grade) {
			case 'A','a' -> System.out.println("우수 회원입니다.");
			case 'B','b' ->System.out.println("일반 회원입니다.");
			default -> System.out.println("손님입니다.");
		}
	}

}
