package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * 기본 타입 간의 변환이거나 기본 타입 요소를 래퍼 객체 요소로 변환하려면 다음과 같은 간편화 메소드를 사용할 수도 있다.
 */
public class MapExample {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()
			.forEach(obj -> System.out.println(obj.intValue()));
	}

}
