package ch17.sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * collect 메소드는 단순히 요소를 수집하는 기능 이외에 컬렉션의 요소들을 그룹핑해서 Map 객체를 생성하는 기능도 제공한다.
 * Collectors.groupingBy() 메소드에서 얻은 Collector를 collect() 메소드를 호출할 때 제공하면 된다.
 * 
 * groupingBy()는 Function을 이용해서 T를 K로 매핑하고, K를 키로해서
 * List<T>를 값으로 갖는 Map 컬렉션을 생성한다.
 */
public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("김자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));

		Map<String, List<Student>> map = totalList.stream()
				.collect(
						Collectors.groupingBy(s -> s.getSex())
				);
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}

}
