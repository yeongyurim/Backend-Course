package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/LosAngeles");
		Calendar now = Calendar.getInstance( timeZone );
		
	}

}
