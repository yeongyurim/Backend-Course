package ch12.sec03.exam03;
/*
 * Object의 toString() 메소드는 객체의 문자 정보를 리턴한다.
 * 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다.
 * 기본적으로 Object의 toString() 메소드는 '클래스명@16진수 해시코드'로 구성된 문자열을 리턴한다.
 * 
 * 객체의 문자 정보가 중요한 경우에는 Object의 toString()메소드를 재정의해서 간결하고 유익한 정보를 리턴하도록 해야한다.
 * 예를 들어 Date 클래스는 현재 날짜와 시간을, String 클래스는 저장된 문자열을 리턴하도록 toString() 메소드를 재정의 하고 있다.
 */
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + "," + os;
	}
}
