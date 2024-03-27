package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java"; // 리터럴 문자열이 같다면 동일한 번지의 주소가 기록된다.
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1] ); // true : 같은 객체 잠조
		System.out.println( strArray[0] == strArray[2] ); // false : 다른 객체 참조
		System.out.println( strArray[0].equals(strArray[2] )); // true : 문자열이 동일
		
		/*
		 * 배열 최초 생성시 초기화값
		 * 
		 * byte = 0
		 * char = '\u0000'
		 * short = 0
		 * int = 0
		 * long = 0L
		 * 
		 * float 0.0F
		 * double = 0
		 * 
		 * boolean = false
		 * 
		 * class = null
		 * interface = null
		 */
	}

}
