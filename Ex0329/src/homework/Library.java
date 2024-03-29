package homework;

public class Library {
	Book[] Books;
	
	public Library() {
		Books = new Book[4];
		
		Books[0] = new Book("이것이 자바다", "한빛미디어", "A-102", true);
		Books[1] = new Book("이것은 자바인가?", "한빛미디어", "A-102", false);
		Books[2] = new Book("자바 바이블", "한빛미디어", "A-102", true);
		Books[3] = new Book("자바의 역사", "한빛미디어", "A-102", true);
	}
	
	String Search(String keyword) {
		StringBuffer sb = new StringBuffer();
		boolean isBook = false;
		
		for(int i=0; i<Books.length; i++) {
			if(Books[i].bookName.contains(keyword)) {
				isBook = true;
				sb.append(Books[i].bookName);
				sb.append("|");
				sb.append(Books[i].provider);
				sb.append("|");
				sb.append(Books[i].location);
				sb.append("|");
				sb.append((Books[i].Availablity)? "대여가능" : "대여중");
				sb.append("\n");
			}
		}
		if(isBook)
			return sb.toString();
		else
			return "해당 도서가 없습니다";
	}
}
