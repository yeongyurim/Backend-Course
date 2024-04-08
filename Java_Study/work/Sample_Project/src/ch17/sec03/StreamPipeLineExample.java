package ch17.sec03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		// 방법1
		Stream<Student> studentStream = list.stream();
		// 중간처리 (학생 객체를 점수로 매핑)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		// Student 객체를 getScore() 메소드의 리턴값으로 매핑
		double avg = scoreStream.average().getAsDouble();
		
		System.out.println("평균 점수: " + avg);
		
		// 방법2
		avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균 점수: " + avg);
	}
}
