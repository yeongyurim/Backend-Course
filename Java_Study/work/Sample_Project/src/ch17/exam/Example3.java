package ch17.exam;

import java.util.Arrays;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		List<Member2> list = Arrays.asList(
				new Member2("홍길동", "개발자"),
				new Member2("김나리", "디자이너"),
				new Member2("신용권", "개발자")
				);
		
		List<Member2> developers = list.stream()
				.filter(s -> s.getJob().contains("개발자"))
				.toList();
		
		developers
			.stream()
			.forEach(m -> System.out.println(m.getName()));
	}

}
