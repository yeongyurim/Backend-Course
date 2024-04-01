package am;

public class MainEx4 {
	
	public static void printTest(AbsEx4 p) {
		p.test();
	}

	public static void main(String[] args) {
		// 추상 클래스 생성
		// 추상 클래스는 직접 인스턴스를 생성할 수 없다.
		// 추상 클래스는 미완성적 개념으로 치부하기 때문
		// AbsEx4 a4 = new AbsEx4();
		ChildEx4 a4 = new ChildEx4();
		printTest(a4);
	}

}
