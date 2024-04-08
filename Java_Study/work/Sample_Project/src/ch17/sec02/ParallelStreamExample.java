package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/*
 * for문과 Iterator는 컬렉션의 요소를 컬렉션 바깥쪽으로 반복해서 가져와 처리하는데, 이것을 외부 반복자라고 한다.
 * 반면 스트림은 요소 처리 방법을 컬렉션 내부로 주입시켜서 요소를 반복 처리하는 데, 이것을 내부 반복자라고 한다.
 */
/*
 * 외부 반복자일 경우 컬렉션의 요소를 외부로 가져오는 코드와 처리하는 코드를 모두 개발자 코드가 가지고 있어야 한다.
 * 반면 내부 반복자일 경우는 개발자 코드에서 제공한 데이터 처리 코드(람다식)를 가지고 컬렉션 내부에서 요소를 반복 처리한다.
 * 내부 반복자는 멀티 코어 CPU를 최대한 활용하기 위해 요소들을 분배시켜 병렬 작업할 수 있다.
 * 하나씩 처리하는 순차적 외부 반복자 보다는 효율적으로 반복할 수 있다는 장점이 있다.
 */
public class ParallelStreamExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}

}
