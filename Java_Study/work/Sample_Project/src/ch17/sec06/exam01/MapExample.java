package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

/*
 * 매핑은 스트림의 요소를 다른 요소로 변환하는 중간 처리 기능이다.
 * 매핑 메소드는 mapXxx(), asDoubleStream(), asLongStream(), boxed(), flatMapXxx()등이 있다.
 */
/*
 * map(Function<T,R)) T->R
 * IntStream mapToInt(ToIntFunction<T>) T-> int
 */
public class MapExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		// Student를 score 스트림으로 변환
		studentList.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}
}
