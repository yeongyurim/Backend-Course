package ch12.exam;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str = "아이디, 이름, 패스워드";
		StringTokenizer strs = new StringTokenizer(str, ",");
		while(strs.hasMoreTokens()) {
			
			System.out.println(strs.nextToken().trim());
		}
	}

}
