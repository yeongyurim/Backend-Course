package ch12.sec03.exam02;

// equals() 메소드와 마찬가지로 hashCode() 메소드 역시 객체의 데이터를 기준으로 재정의해서 새로운 정수값을 리턴하도록 하는 것이 일반적이다.
// 객체가 다르다 할지라도 내부 데이터가 동일하다면 같은 정숙밧을 리턴하기 위해서이다.
public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등 객체입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
	}

}
