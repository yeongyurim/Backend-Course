package pm;

public class StringEx1 {

	public static void main(String[] args) {
		// 프로그램 시작
		String s1 = "Java Programming";
		/*
		 * 문자열 검증시
		 * 문자열 인덱스에 하나씩 접근하여 해당 문자가 문자열에 포함되어 있는지 확인하여야 한다.
		 */
		int len = s1.length();
		System.out.println("s1.length():"+len); // 16
		
		char ch0 = s1.charAt(0); // s1이 기억하는 곳에 있는
		// 문자열에서 첫 문자를 얻어내어 ch0에 저장한다.
		System.out.println("s1.charAt(0):" + ch0);
		
		// String의 기능인 length()와 charAt()을 가지고
		// 특정 문자열에 숫자가 있는지 없는지 판단할 수 있다.
		
		int count = 0; // 숫자가 있을 때마다 count를 증가시킨다.
		for(int i=0; i<s1.length(); i++) {
			// s1으로부터 문자 1개를 얻어낸다.
			char ch = s1.charAt(i);
			
			// ch가 저장한 값이 숫자인지? 아닌지? 판단하자!
			// 유니코드 0~9 사이에 문자값이 포함되는가 확인한다.
			// 숫자 0의 아스키 코드 48
			if(ch>='0' &&  ch<='9')
				++count;
		}
		System.out.println(count);
		
		// concat
	}

}
