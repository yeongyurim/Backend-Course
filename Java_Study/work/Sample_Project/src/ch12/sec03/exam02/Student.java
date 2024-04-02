package ch12.sec03.exam02;

// 객체 해시코드란 객체를 식별하는 정수를 말한다. Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴한다.
// hashCode() 메소드의 용도는 equals()메소드와 비슷한데, 두 객체가 동등한지를 비교할 때 주로 사용한다.

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() { return no; }
	public String getName() { return name; }
	
	public int hashCode() {
		int hashCode = no + name.hashCode(); // Object의 hashCode() 메소드를 재정의해서 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 함
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	// Object의 equals() 메소드를 재정의해서 Student 객체인지를 확인하고, 학생 번호와 이름이 같으면 true를 리턴하도록 함
}
