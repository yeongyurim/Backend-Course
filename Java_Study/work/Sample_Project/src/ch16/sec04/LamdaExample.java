package ch16.sec04;

// return 문 하나만 있을 경우에는 중괄호와 함께 return 키워드를 생략할 수 있다.
public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 실행문이 두 개 이상일 경우
		person.action((x,y) -> {
			double result = x + y;
			return result;
		});
		
		// 리턴문이 하나만 있을 경우(연산식)
		person.action((x, y) -> {
			return (x + y);
		});
		person.action((x,y) -> (x + y));
		
		// 리턴문이 하나만 있을 경우(메소드 호출)
		person.action((x,y) -> sum(x, y));
	}
	
	public static double sum(double x, double y) {
		return (x+y);
	}

}
