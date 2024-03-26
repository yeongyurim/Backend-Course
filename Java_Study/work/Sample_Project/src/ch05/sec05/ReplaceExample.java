package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// String 객체의 문자열은 변경이 불가한 특성을 갖는다.
		// 그러므로 replace() 메소드가 리턴하는 문자열은 원래 문자열의 수정본이 아니라 완전히 새로운 문자열이다.
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
