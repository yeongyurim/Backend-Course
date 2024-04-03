package ch12.sec08;

import java.util.*;
import java.text.*;

/* 
 * Date - 날짜 정보를 전달하기 위해 사용
 * Calendar - 다양한 시간대별로 날짜와 시간을 얻을 때 사용
 * LocalDateTime = 날짜와 시간을 조작할 때 사용
 */
public class DataExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
