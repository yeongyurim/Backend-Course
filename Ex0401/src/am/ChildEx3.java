package am;

public class ChildEx3 extends ParentEx3 {

	@Override
	public void setMsg(String m) {
		// 부모의 함수를 재정의했으므로 현재 자식의 함수가 우선시 된다.
		// but instance 범위가 부모의 것으로 지정되었을 경우에는 override 되지 않는다.
		msg = "child:" + m;
	}
	
}
