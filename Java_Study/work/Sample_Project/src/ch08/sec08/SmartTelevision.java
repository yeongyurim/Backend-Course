package ch08.sec08;
// 구현 객체는 인터페이스 A와 인터페이스 B를 implements 뒤에 쉼표로 구분해서 작성해, 모든 인터페이스가 가진 추상 메소드를 재정의 해야한다.
public class SmartTelevision implements RemoteControl, Searchable {
	// turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	// turnoff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	// search() 추상 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
