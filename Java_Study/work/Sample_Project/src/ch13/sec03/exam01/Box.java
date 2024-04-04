package ch13.sec03.exam01;

/*
 * 제네릭 메소드는 타입 파라미터를 가지고 있는 메소드를 말한다.
 * 타입 파라미터가 메소드 선언부에 정의된다는 점에서 제네릭 타입과 차이가 있다.
 * 제네릭 메소드는 리턴 타입 앞에 <> 기호를 추가하고 타입 파라미터를 정의한 뒤, 리턴 타입과 매개변수 타입에서 사용한다.
 */
public class Box<T> {
	// 필드
	private T t;
	
	// Getter 메소드
	public T get() {
		return t;
	}
	
	// Setter 메소드
	public void set(T t) {
		this.t = t;
	}
}
