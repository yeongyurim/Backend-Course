package am;

// abstract 와 접근 제한자는 순서가 바뀌어도 상관 x
public abstract class AbsEx4 {
	String msg;
	
	public void setMsg(String n) {
		msg = n;
	}
	
	// 추상 메소드
	// 부모가 가지고 있어야 하는 기능은 맞지만 
	// 자식들이 반드시 재정의해야 하는 메소드들은 추상 메소드로 정의한다.
	abstract public void test();
}
