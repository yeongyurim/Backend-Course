package ch07.sec09;

public class ParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.echo();
		// promotion시 자동으로 오버라이딩된 메소드를 사용함
	}

}
