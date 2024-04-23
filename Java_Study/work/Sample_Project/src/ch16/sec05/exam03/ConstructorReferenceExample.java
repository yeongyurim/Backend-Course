package ch16.sec05.exam03;

/*
 * 생성자를 참조한다는 것은 객체를 생성하는 것을 의미한다.
 * 람다식이 단순히 객체를 생성하고 리턴하도록 구성된다면 람다식을 생성자 참조로 대치할 수 있다.
 */
public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		Member m1 = person.getMember1( Member :: new );
		System.out.println(m1);
		System.out.println();
		
		Member m2 = person.getMember2( Member :: new );
		System.out.println(m2);
	}
}
