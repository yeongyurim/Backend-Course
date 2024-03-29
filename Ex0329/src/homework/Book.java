package homework;

public class Book {
	// 도서를 의미하는 클래스
	String bookName;
	String provider;
	String location;
	boolean Availablity;
	
	public Book(String bookName, String provider, String location, boolean Availability) {
		this.bookName = bookName;
		this.provider = provider;
		this.location = location;
		this.Availablity = Availability;
	}
	
	boolean isAvailable() {
		return Availablity;
	}
}
