package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

/*
 * distinct - 중복제거
 * filter() - 조건 필터링
 * - 매개 타입은 요소 타입에 따른 함수형
 * 	인터페이스이므로 람다식으로 작성가능
 */
public class FilteringExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");	list.add("신용권");
		list.add("김자바");	list.add("신용권");	list.add("신민철");
		
		// 중복 요소 제거
		list.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 신으로 시작하는 요소만 필터링
		list.stream()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
	}
}
