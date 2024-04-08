package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
/*
 * 지금까지 컬렉션 및 배열에 저장된 요소를 반복 처리하기 위해서는 for문을 이용하거나
 * Iterator를 이용했다.
 * 
 * Java 8 부터는 또 다른 방법으로 컬렉션 및 배열의 요소를 반복 처리하기 위해 스트림을 사용할 수 있다.
 * 스트림은 요소들이 하나씩 흘러가면서 처리된다는 의미를 가지고 있다.
 * List 컬렉션에서 요소를 반복 처리하기 위해서 스트림을 사용하면 다음과 같다.
 * 
 * List 컬렉션의 stream() 메소드로 Stream 객체를 얻고, forEach() 메소드로 요소를 어떻게 처리할지를 람다식으로 제공한다.
 */

/*
 * 스트림은 Iterator와 비슷한 반복자이지만, 다음과 같은 차이점을 가지고 있다.
 * 1) 내부 반복자이므로 처리 속도가 빠르고 병렬처리에 효율적이다.
 * 2) 람다식으로 다양한 요소처리를 정의할 수 있다.
 * 3) 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다.
 */
public class StreamExample {
	public static void main(String[] args) {
		// Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		
		// Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream(); // 스트림 얻기
		stream.forEach( name-> System.out.println(name)); // 람다식: 요소 처리 방법
	}
}

