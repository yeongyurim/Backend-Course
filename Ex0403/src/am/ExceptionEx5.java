package am;

public class ExceptionEx5 {

	public void ex1() {
		System.out.println("ex1함수");
		
		// 다음의 ex2() 함수는 예외를 던지고 있기 때문에
		// 호출하는 곳에서 예외처리를 해주어야 함
		try {
			ex2(); // 다른 함수 호출			
		} catch(Exception e) {
			// 예외가 발생한 경우를 순차적으로 하나씩 출력해라
			e.printStackTrace(); 
		}
		
		System.out.println("ex2함수 수행 끝");
	}
	
	// 예외 발생시 밑에 코드가 중요하지 않을 떄
	public void ex2() throws ArithmeticException {
		System.out.println("수행1");
		System.out.println("수행2");
		System.out.println("수행3" + (10/0));
		System.out.println("수행4");
		System.out.println("수행5");
		System.out.println("수행6");
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		ExceptionEx5 ex5 = new ExceptionEx5();
		ex5.ex1();
		System.out.println("프로그램 종료");
	}

}
