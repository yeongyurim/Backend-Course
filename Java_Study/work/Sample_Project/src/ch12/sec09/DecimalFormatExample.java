package ch12.sec09;

import java.text.DecimalFormat;

/*
 * Format 클래스는 숫자 또는 날짜를 원하는 형태의 문자열로 변환해주는 기능을 제공한다.
 * DecimalFormat - 숫자를 형식화된 문자열로 변환
 * SimpleDateFormat - 날짜를 형식화된 문자열로 변환
 */
public class DecimalFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234567.89;
		
		DecimalFormat df;
		
		// 정수 자리까지 표기
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		//무조건 소수 첫째 자리까지 표기
		df = new DecimalFormat("#,###.0");
		System.out.println( df.format(num) );
	}

}
