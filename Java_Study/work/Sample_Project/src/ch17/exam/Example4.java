package ch17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		List<Member3> list = Arrays.asList(
				new Member3("홍길동", "개발자"),
				new Member3("김나리", "디자이너"),
				new Member3("신용권", "개발자")				
				);
		
		Map<String, List<Member3>> groupingMap = list.stream()
				.collect(
						Collectors.groupingBy(s -> s.getJob())
						);
		
		System.out.println("[개발자]");
		groupingMap.get("개발자")
			.stream()
			.forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("[디자이너]");
		groupingMap.get("디자이너")
			.stream()
			.forEach(s -> System.out.println(s));
		System.out.println();
	}

}
