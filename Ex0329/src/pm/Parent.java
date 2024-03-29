package pm;
// Plain old Java Object
// Spring
// EJB
// Instance <- 객체를 찍어낸 결과물
public class Parent {
	int value = 100;
	
	public void setValue(int value) {
		this.value = value;
	}
	
	// getter는 속성값을 반환하는 기능들
	public int getValue() {
		return value;
	}
}
