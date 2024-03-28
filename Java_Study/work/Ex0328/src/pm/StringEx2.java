package pm;

public class StringEx2 {

	public static void main(String[] args) {
		// 프로그램 시작 부분
		
		String s1 = "Test";
		String s2 = "123";
		String s3 = s1.concat(s2); // s3 = s1+s2; 내부적으로 new String("")을 통해 객체 생성하는듯
		String s4 = "Test123";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3==s4);
		
		if(s3.equals(s4))
			System.out.println("s3과 s4의 내용이 서로 같다.");
	}

}
