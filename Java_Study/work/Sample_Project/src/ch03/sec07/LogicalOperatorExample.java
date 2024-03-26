package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		// int charCode = 'a';
		// int charCode = 5;
		
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요!");
		}
		
		if( (97<=charCode) & (charCode<=122) ) {
			System.out.println("소문자이군요!");
		}
		
		if( (48<=charCode) & (charCode<=57) ) {
			System.out.println("0~9 숫자이군요!");
		}
		
		
		
		
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) { // 비트연산자를 논리연산에 사용할 시 앞의 문장이 true여도 뒤에 문장을 수행한다.
			System.out.println("2 또는 3의 배수이군요!");
		}
	}

}
