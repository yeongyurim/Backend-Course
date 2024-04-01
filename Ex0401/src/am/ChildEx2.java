package am;

public class ChildEx2 extends ParentEx2 {
	
	// 부모가 가지는 함수를 다시한번 정의하는 것을 재정의라고 한다.
	// 이때 정의법은 똑같이 하지만 내뇽을 다르게 한다.
	public void print(String msg) {
		super.print(msg);
		System.out.println("자식: "+msg); // 재정의된 함수는
										// 우선순위를 재정의된 자식클래스의 함수가 우선한다.
	}
}
