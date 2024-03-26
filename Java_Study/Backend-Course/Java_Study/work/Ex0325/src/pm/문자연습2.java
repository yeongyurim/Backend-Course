package pm;

public class 문자연습2 {

	public static void main(String[] args) {
		// 대문자 A를 저장하는 문자형 변수 a를 정의하자!
		char a = 'A'; // 사실은 내부적으로 'A'의 유니코드값이 저장됨!
		
		// 문자형 변수 b를 선언하자
		int b = a + 1; // a의 값을 저장
		
		char c = (char)b; // 정수형 변수 b를 문자형인 char로 형 변환을 강제로 수행한다.
		System.out.println(a);
		System.out.println(c);
	}
}
