package ch13.sec04;
/*
 * 특정 타입과 자식 또는 구현 관계에 있는 타입만 대체할 수 있는 타입 파라미터를 제한된 타입 파라미터라고 한다.
 */
public class GenericExample {
	// 제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		// T의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " +
							t2.getClass().getSimpleName() + ")");
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue() ;
		
		return (v1 == v2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
