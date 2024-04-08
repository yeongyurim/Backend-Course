package ch15.sec05.exam03;

import java.util.TreeSet;

/*
 * 비교 기능이 있는 Comparable 구현 객체를 TreeSet에 저장하거나 TreeMap의 키로 저장하는 것이 원칙이지만, 비교 기능이 없는 Comparable 비구현
 * 객체를 저장하고 싶다면 방법은 없진 않다.
 * TreeSet과 TreeMap을 생성할 때 비교자를 제공하면 된다.
 */
public class ComparableExample {

	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// 객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		// 객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}
	}

}
