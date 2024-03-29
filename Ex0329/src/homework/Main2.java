package homework;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할도서명: ");
		String bookName = scanner.nextLine();
		
		// 키보드로 부터 받은 검색어를 인자로 보내어
		// 검색된 도서들을 문자열로 받아야 한다.
		System.out.println(library.Search(bookName));
	}
	/*
	 * [사원관리]
	 * 
	 * 검색할 사원명: 지매
	 * 120 | 일지매 | 사원 | 개발1팀
	 * 222 | 지매일 | 대리 | 기획팀
	 */
}
