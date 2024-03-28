package am;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 프로그램 시작부분
		
		// 문자형 배열 4개짜리를 선언하고 생성하자!
		char[] ar = new char[4];
		
		// 알파벳 문자를 난수로 발생시켜 저장하자!
		for(int i=0; i<ar.length; i++) {
			int r = (int)(Math.random()*26+65);
			ar[i] = (char)r; // casting 해주어야함
			// 객체는 Heap에 만들어짐
		}
		
	}

}
