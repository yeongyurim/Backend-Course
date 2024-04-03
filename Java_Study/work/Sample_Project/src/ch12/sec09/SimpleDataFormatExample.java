package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 패턴문자 
 * 
 * y 년 
 * M 월
 * d 일
 * D 월 구분이 없는 일
 * 요일
 * 오전/오후
 * 년의 몇 번째 주
 * 월의 몇 번째 주
 */
public class SimpleDataFormatExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("오늘은 D번째 날");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("이날의 d번쨰 날");
		System.out.println( sdf.format(now) );
	}

}
