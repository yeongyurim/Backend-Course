package am;

public class ExceptionEx4 {
	
	public boolean test() {
		boolean chk = false;
		try {
			System.out.println(10/3);
			return chk;
		} catch(Exception e) {
			System.out.println("예외발생");
		} finally {
			// 예외발생 여부와 상관없이 무조건 수행하는 영역
			// try 혹은 catch에서 return문이 있어도 finally가 무조건적으로 수행되고 나간다.
			System.out.println("finallly~~~~!!!");
		}
		return true;
		
	}
	
	// static은 static만 호출 가능하다.
	// static이 아닌 멤버들은 반드시 인스턴스화 이후 사용해야 한다.
	public static void main(String[] args) {
		// 프로그램 시작
		ExceptionEx4 ex4 = new ExceptionEx4();
		boolean chk = ex4.test(); // 멤버함수 호출
		System.out.println(chk);
	}
}
