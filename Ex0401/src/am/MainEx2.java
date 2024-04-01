package am;

public class MainEx2 {

	public static void main(String[] args) {
		// 자식 클래스 생성
		ChildEx2 c1 = new ChildEx2();

		c1.print("테스트");
		
		ParentEx2 c2 = new ParentEx2();
		c2.print("TT");
	}

}
