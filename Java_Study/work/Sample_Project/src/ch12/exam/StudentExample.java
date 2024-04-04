package ch12.exam;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		// Student를 저장하는 HashSet 생성
		HashSet<Student> hashSet = new HashSet<Student>();
		
		// Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1")); // 같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Student("3"));
		
		// 저장된 Student 수 출력
		// HashSet 이용시 hashset에서 해당 제네릭 객체의 equals 메소드를 이용해 해당 객체가 같은 객체인지 여부를 판단한다.
		System.out.println("저장된 Student 수:" + hashSet.size()); 
	}

}
