package pm;

public class Child extends Parent{
	public static void main(String[] args) {
		Child child = new Child();
		child.setValue(200);
		
		System.out.println(child.getValue());
	}
}
