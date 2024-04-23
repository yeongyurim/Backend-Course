package ch17.exam;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("김자바", 26)
				);
		
		double avg = list.stream()
				.mapToInt(s -> s.getAge())
				.average()
				.getAsDouble();
		
		System.out.println("멤버들의 나이 평균 값: " + avg);
	}

}
