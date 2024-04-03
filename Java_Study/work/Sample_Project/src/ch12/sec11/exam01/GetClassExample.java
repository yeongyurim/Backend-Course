package ch12.sec11.exam01;

import ch06.sec06.exam01.Car;

/*
 * 자바는 클래스와 인터페이스의 메타 정보를 Class 객체로 관리한다.
 * 여기서 메타 정보란 패키지 정보, 타입 정보, 멤버(생성자, 필드, 메소드) 정보 등을 말한다.
 * 이러한 메타정보를 프로그램에서 읽고 수정하는 행위를 reflection이라고 한다.
 */

/*
 * Package getPackage() 패키지 정보 읽기
 * String getSimpleName() 패키지를 제외한 타입 이름
 * String getName() 패키지를 포함한 전체 타입 이름
 */
public class GetClassExample {

	public static void main(String[] args) throws Exception {
		// how1
		Class clazz = Car.class;
		
		// how2
		// Class clazz = Class.forName("ch12.sec11.exam01.Car");
		
		// how3
		// Class clazz = car.getClass();
		
		System.out.println("패키지 : "+ clazz.getPackage().getName());
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름 : " + clazz.getName());
	}

}
