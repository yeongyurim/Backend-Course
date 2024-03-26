package pm;

public class 증감연산자6 {

	public static void main(String[] args) {
		// 증감연산자(++:1증가, --:1감소)
		int a = 10;
		
		System.out.println(++a); // 11
		System.out.println(--a); // 10
		
		System.out.println(a++); // 10 우선순위가 가장 낮다.
		// 증감연산자가 변수뒤에 존재하면, 연산우선순위가 가장 낮다.
		// 제어가 다음행으로 이동할 때 a의 값을 1증가한다.
		System.out.println(a); // 11
		
		int b = 10;
		
		System.out.println(a++ > ++b);
	}

}
