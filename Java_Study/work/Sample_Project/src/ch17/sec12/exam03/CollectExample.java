package ch17.sec12.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ch17.sec12.exam02.Student;

/*
 * Collectors.groupingBy() 메소드는 그룹핑 후 매핑 및 집계(평균, 카운팅, 연결, 최대, 최소, 합계)를 수행할 수 있도록
 * 두 번째 매개값인 Collector를 가질 수 있다.
 */
public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("김자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		Map<String, Double> map = totalList.stream()
				.collect(
						Collectors.groupingBy(
								s -> s.getSex(),
								Collectors.averagingDouble(s -> s.getScore())
						)
				);
		
		System.out.println(map);
				
	}

}
