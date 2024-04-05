package ch15.sec03.exam01;

import java.util.*;

/*
 * List collection은 저장 순서를 유지하지만, Set 컬렋션은 저장 순서가 유지되지 않는다.
 * 또한 객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다.
 * Set 컬렉션은 수학의 집합에 비유 될 수 있다.
 * 집합은 순서와 상관없고 중복이 허용되지 않기 때문이다.
 */

/*
 * boolean add - 주어진 객체를 성공적으로 저장하면 true를 리턴하고 중복 객체면 false를 리턴
 * boolean contains - 주어진 객체가 저장되어 있는지 여부
 * isEmpty - 컬렉션이 비어있는지 조사
 * iterator - 저장된 객체를 한 번씩 가져오는 반복자 리턴
 * size - 저장되어 있는 전체 객체 수 리턴
 * clear - 저장된 모든 객체를 삭제
 * remove - 주어진 객체를 삭제
 */

/*
 * HashSet은 동일한 객체는 중복 저장하지 않는다.
 * 여기서 동일한 객체란 동등 객체를 말한다.
 * HashSet은 다른 객체라도 hashCode() 메소드의 리턴값이 같고,
 * equals() 메소드가 true를 리턴하면 동일한 객체라고 판단하고 중복 저장하지 않는다.
 */
public class HashSetExample {

	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 중복 객체는 저장하지 않음
		set.add("Spring");

		int size = set.size();
		System.out.println("총 객체 수: "  + size);
	}

}
