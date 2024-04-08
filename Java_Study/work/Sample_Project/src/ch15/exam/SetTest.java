package ch15.exam;

import java.util.HashSet;
import java.util.Set;

class Person {
	public String name;
	public int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<>(); // Set은 컬렉션이고 뒤에 오는 게 진짜 자료구조임
		set.add(null);
		
		System.out.println(set.size());
	}

}
