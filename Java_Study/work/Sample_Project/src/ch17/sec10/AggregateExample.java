package ch17.sec10;

import java.util.Arrays;
/*
 * 집계는 최종 처리 기능으로 요소들을 처리해서 카운팅, 합계, 평균값, 최댓값, 최솟값등과 같이 하나의 값으로 산출하는 것을 말한다.
 * 즉, 대량의 데이터를 가공해서 한의 갑승로 축소하는 리덕션이라고 볼 수 이싿.
 */
public class AggregateExample {

	public static void main(String[] args) {
		// 정수 배열
		int[] arr = {1, 2, 3, 4, 5};
		
		// 카운팅
		long count = Arrays.stream(arr)
				.filter(n -> n%2 == 0 )
				.count();
		System.out.println("2의 배수 개수: " + count);
		
		// 총합
		long sum = Arrays.stream(arr)
				.filter(n -> n%2 == 0)
				.sum();
		System.out.println("2의 배수의 합: " + sum);
		
		// 평균
		double avg = Arrays.stream(arr)
				.filter(n -> n%2 == 0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균: " + avg);
		
		// 최댓값
		int max = Arrays.stream(arr)
				.filter(n -> n%2 == 0)
				.max()
				.getAsInt();
		System.out.println("최댓값: " + max);
		
		// 최솟값
		int min = Arrays.stream(arr)
				.filter(n -> n%2 == 0)
				.min()
				.getAsInt();
		System.out.println("최솟값: " + min);
		
		// 첫 번째 요소
		int first = Arrays.stream(arr)
				.filter(n -> n%3 == 0)
				.findFirst()
				.getAsInt();
		System.out.println("첫 번째 3의 배수: " + first);
	}

}
