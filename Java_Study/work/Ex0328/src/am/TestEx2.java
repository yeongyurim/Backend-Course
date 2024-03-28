package am;

public class TestEx2 {
	// 속성(변수/상수)
	int age; // 0
	String name; // null
	
	// 동작(함수 또는 메서드)
	// 접근 제한자  / 반환형  / 함수 이름
	public void setName(String name) {
		// 이름을 저장하는 동작
		// 이름을 n이라는 변수로 받아서 name이라는 
		// 멤버변수에 저장하는 동작
		//
		this.name = name;
	} // 함수의 끝
	
	public void setAge(int age) {
		this.age = age;
	}
}
