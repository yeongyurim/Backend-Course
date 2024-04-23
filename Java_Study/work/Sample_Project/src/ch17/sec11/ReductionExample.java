package ch17.sec11;

import java.util.Arrays;
import java.util.List;

/*
 * 요소 커스텀 집계
 * 스트림은 기본 집계 메소드인 sum(), average(), count(), max(), min()을 제공하지만,
 * 다양한 집계 결과물을 만들 수 있도록 reduce() 메소드도 제공한다.
 * 
 * BinaryOperator는 함수형 인터페이스이다.
 * BinaryOperator는 두 개의 매개값을 받아 하나의 값을 리턴하는 apply() 메소드를 가지고 있기 때문에
 * 람다식을 매개 변수 두 개와 반환 값으로 작성할 수 있다.
 */
public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",92),
				new Student("신용권", 95),
				new Student("김자바", 99)
		);
		
		// 방법1
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();
		
		// 방법2
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}

}
