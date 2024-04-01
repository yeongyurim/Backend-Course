package pm;

public class Ex1 implements InterEx1 {

	@Override
	public int sum(int n) {
		// 구현하겠다고 한 InterEx1의 추상 메서드를 재정의한 것
		return value + n;
	}

	@Override
	public int product(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
