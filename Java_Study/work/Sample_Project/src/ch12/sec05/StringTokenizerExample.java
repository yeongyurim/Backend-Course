package ch12.sec05;

import java.util.StringTokenizer;
/*
 * 문자열이 구분자로 연결되어 있을 경우, 구분자를 기준으로 문자열을 분리하려면 String의 split 메소드를 이용하거나 java.util
 * 패키지의 StringTokenizer 클래스를 이용할 수 있다.
 * 
 * 여러가지 구분자로 구분된 문자열을 구분하려면 정규표현식으로 분리하는 split()메소드를 사용해야 한다.
 * 
 * int countTokens() 분리할 수 있는 문자열의 총 수
 * boolean hasMoreTokens() 남아있는 문자열이 남아있는지 여부
 * String nextToken() 문자열을 하나씩 가져옴
 */
public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
