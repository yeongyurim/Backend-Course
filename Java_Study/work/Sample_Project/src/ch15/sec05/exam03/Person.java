package ch15.sec05.exam03;

/*
 * TreeSet에 저장되는 객체와 TreeMap에 저장되는 키 객체는 저장과 동시에 오름차 순으로 저장되는데,
 * 어떤 객체든 정렬될 수 있는 것은 아니고 객체가 Comparable 인터페이스를 구현하고 있어야 가능하다.
 * Integer, Double, String 타입은 모두 Comparable을 구현하고 있기 때문에 상관없지만,
 * 사용자 정의 객체를 저장할 때에는 반드시 Comparable을 구현하고 있어야 한다.
 */

/*
 * compareTo(T o) 주어진 객체와 같으면 0을 리턴
 * 주어진 객체보다 적으면 음수를 리턴
 * 주어진 객체보다 크면 양수를 리턴
 */
public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}
