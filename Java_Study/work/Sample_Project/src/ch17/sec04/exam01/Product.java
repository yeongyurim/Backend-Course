package ch17.sec04.exam01;
/*
 * java.util.stream 패키지에는 스트림 인터페이스들이 있다. 
 * 
 * BaseStream에는 모든 스트림에서 사용할 수 있는 공통 메소드들이 정의되어 있다.
 * Stream은 객체 요소를 처리하는 스트림이고, InStream, LongStream, DoubleStream은 각각 기본타입인
 * int, long, double 요소를 처리하는 스트림이다.
 * 
 * 이 스트림 인터페이스들의 구현 객체는 다양한 리소스로부터 얻을 수 있다.
 * 주로 컬렉션과 배열에서 얻지만, 다음과 같은 리소스로부터 스트림 구현 객체를 얻을 수도 있다.
 */
public class Product {
	private int pno;
	private String name;
	private String company;
	private int price;
	
	public Product(int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	public int getPno() { return pno; }
	public String getName() { return name; }
	public String getCompany() { return company; }
	public int getPrice() { return price; }

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{")
				.append("pno:" + pno + ", ")
				.append("name:" + name + ", ")
				.append("company:" + company + ", ")
				.append("price:" + price)
				.append("}")
				.toString();
	}
}
