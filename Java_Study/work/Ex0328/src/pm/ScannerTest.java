package pm;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		String a, b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a:");
		a = scanner.nextLine();
		System.out.println("b:");
		b = scanner.nextLine();
		System.out.println("c:");
		c = scanner.nextInt();
	}

}
