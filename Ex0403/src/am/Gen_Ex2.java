package am;
// DateType -> T
// Element -> E
// Value -> V
// 기본 자료형만 아니면 제네릭타입으로 들어갈 수 있음
public class Gen_Ex2 <T>{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
