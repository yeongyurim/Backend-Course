package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println("var1: " + var1);
		} // 최댓값 도달 후 오버 플로우 발생
		
		System.out.println("----------------------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		} // 최솟값 도달 후 언더 플로우 발생
	}

}
