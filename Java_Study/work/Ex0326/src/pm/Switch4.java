package pm;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 키보드와 연결된 스캐너 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("코드(S,E,L) 중 하나를 입력해주세요 > ");
		String code = scanner.nextLine(); // 키보드로부터 문자열 받기
		
		switch(code) {
		case "E":
			System.out.println("전자제품!");
			break;
		case "S":
			System.out.println("스포츠용품");
			break;
		case "L":
			System.out.println("생활용품");
			break;
		}
		
	}

}
