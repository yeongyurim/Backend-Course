package pm;

public class StringEx3 {

	public static void main(String[] args) {
		// 문자열 객체 생성
		String s1 = "Test Java Example";
		
		// 문자 또는 문자열 수정
		String s2 = s1.replaceAll("a", "*");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-- substring연습 -----------");
		
		/// s1에서 대문자 J를 찾아서 인덱스 값을 알아낸다.
		String s3 = s1.substring(s1.indexOf("Java"));
		System.out.println(s3);
		
		// 메소드 오버로딩 : 같은 이름의 메소드에 매개변수의 구성이 다른 메소드들을 말한다.
		// 메소드 오버라이딩 : 부모의 메소드를 똑같은 이름으로 자식 클래스에서 재정의 하는 기법
		s3 = s1.substring(5,8);
		System.out.println(s3);
	}

}
