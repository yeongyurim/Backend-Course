package ch12.sec10;

import java.util.regex.Pattern;

/*
 * 문자열이 정해져 있는 형식으로 구성되어 있는지 검증해야 할 때 검증할 수 있는 식
 * 
 * 정규 표현식 작성 방법
 * [] 한개의 문자 ex) [abc] - a,b,c 중 하나의 문자
 * 				  [^abc] - a,b,c 이외의 하나의 문자
 * 				  [a-zA-Z] - a~z A~Z 중의 하나의 문자
 * 
 * \d 한개의 숫자, [0-9]와 동일
 * \s 공백
 * \w 한 개의 알파벳 또는 한 개의 숫자, [a-zA-Z_0-9]와 동일
 * \. .
 * . 모든 문자 중 한 개의 문자
 * ? 없음 또는 한 개
 * * 없음 또는 한 개 이상
 * + 한 개 이상
 * {n} 정확히 n개
 * {n.} 최소한 n개
 * {n,m} n개부터 m개 까지
 * a|b a또는 b
 * () 그룹핑
 * 
 * \.은 문자로서의 점을 . 은 모든 문자 중에서 한 개의 문자를 말한다.
 * 
 * Pattern 클래스로 검증
 * Pattern 클래스는 정규표현식으로 문자열을 검증하는 mathes() 메소드를 제공한다.
 * 첫 번쨰 매개값은 정규 표현식이고, 두 번쨰 매개값은 검증할 문자열이다. 검증한 후의 결과는 boolean 타입으로 리턴된다.
 * 
 * REGEXP = REGular EXPression
 */
public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-//d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@mycompanycom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}
