package ch08.sec13;

// Java15부터는 무분별한 자식 인터페이스 생성을 방지하기 위해 봉인된 인터페이스를 사용할 수 있다.
// sealed 키워드를 사용하면 permits키워드 뒤에 상속 가능한 자식 인터페이스를 지정해야한다.
// sealed interface를 상속하는 자식 interface는 non-sealed 키워드로 다음과 같이 선언하거나
// sealed 키워드를 사용해서 또 다른 봉인 인터페이스로 선언해야 한다.
public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}
