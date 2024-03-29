package ch07.sec11;

// 기본적으로 final 클래스를 제외한 모든 클래스는 부모 클래스가 될 수 있다.
// 그러나 Java 15부터는 무분별한 자식 클래스 생성을 방지하기 위해 봉인된 클래스가 도입되었다.
// sealed 키워드를 사용하면 permits 키워등 뒤에 상속 가능한 자식 클래스를 지정해야 한다.
// 봉인된 Person 클래스를 상속하는 Employee 와 Manager는 final 또는 non-sealed 키워드로 선언하거나 
// sealed 키워드를 사용해서 또 다른 봉인 클래스로 선언해야 한다.

public sealed class Person permits Employee, Manager {
	// 필드
	public String name;
	
	// 메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
