package ch07.exam;

public class Parent2 {
	public String nation;
	
	public Parent2() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
