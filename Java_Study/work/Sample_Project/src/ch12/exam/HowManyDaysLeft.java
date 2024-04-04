package ch12.exam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HowManyDaysLeft {

	public static void main(String[] args) {
		// xxxx년 xx월 xx일 x요일 xx시 xx분
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분");
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today.format(dtf));
		
		LocalDateTime endOfYear = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
		long days = today.until(endOfYear, ChronoUnit.DAYS);
		
		System.out.println("연말까지 " +days +"일 남았습니다.");
	}

}
