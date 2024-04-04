package ch12.exam;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		// 첫 번째는 알파벳
		// 두 번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 ID값 검사
		// 알파벳은 대소문자를 모두 허용
		String id = "Aaaaaaaa1";
		String regExp = "[a-zA-Z].[a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id)? true : false; 
		if(isMatch) 
			System.out.println("ID로 사용할 수 있습니다.");
		else
			System.out.println("ID로 사용할 수 없습니다.");
	}

}
