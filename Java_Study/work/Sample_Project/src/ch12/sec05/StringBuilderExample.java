package ch12.sec05;

/*
 * append - 문자열을 끝에 추가
 * insert - 문자열을 지정 위치에 추가
 * delete - 문자열 일부를 삭제
 * replace - 문자열 일부를 대체
 * toString - 완성된 문자열을 리턴
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString(); // 메소드 체이닝 패턴
		
		System.out.println(data);
	}

}
