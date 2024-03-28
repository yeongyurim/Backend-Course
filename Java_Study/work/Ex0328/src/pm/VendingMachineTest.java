package pm;

import java.util.Scanner;

public class VendingMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vendingMachine = new VendingMachine();
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액: ");
		int money = scanner.nextInt();
		vendingMachine.setInsertedMoney(money);
		vendingMachine.printDrinks();
	}

}
