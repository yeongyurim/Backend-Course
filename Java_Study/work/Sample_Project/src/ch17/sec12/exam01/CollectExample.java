package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 스트림은 요소들을 필터링 또는 매핑한 후 요소들을 수집하는 최종 처리 메소드인 collect()를 제공한다.
 * 이 메소드를 이용하면 필요한 요소만 컬렉션에 담을 수 있고, 요소들을 그룹핑한 후에 집계도 할 수 있다.
 * 
 * Stream의 collect(Collector<T,A,R> collector) 메소드는 필터링 또는 매핑된 요소들을 새로운 컬렉션에 수집하고,
 * 이 컬렉션을 리턴한다.
 * 매개값인 Collector는 어떤 요소를 어떤 컬렉션에 수집할 것인지를 결정한다.
 * 
 * 타입 파라미터의 T는 요소, A는 누적기, R은 요소가 저장될 컬렉션이다.
 * T요소를 A누적기가 R에 저장한다는 의미이다.
 */
public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("김자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		// 남학생만 묶어 List 생성
		//List<Student> maleList = totalList.stream()
		//		.filter(s -> s.getSex().equals("남"))
		//		.collect(Collectors.toList());
		
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.toList();
		
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
						Collectors.toMap(
								s -> s.getName(), 
								s -> s.getScore()
						)
				);
		
		System.out.println(map);
				
	}

}
