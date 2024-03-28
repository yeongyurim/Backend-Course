package pm;

// Buffer = 임시기억장소
public class StringBufferEx5 {

	public static void main(String[] args) {
		// 문자열 편집이 가능한 StringBuffer객체 생성
		StringBuffer sb1 = new StringBuffer("JAVA");
		StringBuffer sb2 = sb1;
		
		if(sb1 == sb2)
			System.out.println("sb1과 sb2의 주소가 같다.");
		else
			System.out.println("sb1과 sb2의 주소가 다르다.");
		
		// 수정을 하자
		sb1.append(" Programming");
		
		System.out.println(sb2);
		
		sb2.delete(0, 3);

		System.out.println(sb1);
		
		sb1.insert(2, "-");
		
		System.out.println(sb2);
	}

}
