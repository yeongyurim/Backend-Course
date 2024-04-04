package ch12.exam;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder strb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			strb.append(i);
		}
		System.out.println(strb.toString());
	}

}
