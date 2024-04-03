package am;

public class ExceptionEx3 {
	public static void main(String[] args) {
		// 프로그램 시작
		
		try {
			// 예외가 발생 가능한 문장들
			System.out.println(10/0);
			System.out.println("두번째 출력문!");
		} catch (ArithmeticException e) {
			System.out.println("예외발생 문장1");
		} catch (Exception e) {
			System.out.println("예외발생 문장2");
		}
	}
}
