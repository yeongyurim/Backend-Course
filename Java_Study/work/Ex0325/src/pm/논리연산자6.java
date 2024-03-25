package pm;

public class 논리연산자6 {

	public static void main(String[] args) {
		// 논리연산자 (&&:그리고, ||: 또는)
		
		int a = 10;
		int b = 10;
		
		System.out.println(++a > b++ || ++a != ++b); // 후위 증감연산자가 뒤에서 논리연산자를 만나면 증감이 수행된다.
		// ||연산자를 중심으로 첫번쨰 조건에서 결과가 true이므로
		// 두번째 조건은 수행하지 않는다.
		System.out.println(a);
		System.out.println(b);
	}

}
