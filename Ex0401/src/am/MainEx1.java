package am;

public class MainEx1 {
	
	public static void test(CarEx1 mc) {
		mc.setModel("자동차모델:M1");
	}
	public static void main(String[] args) {

		// 객체 생성
		MyCarEx1 mc1 = new MyCarEx1();
		
		HDCarEx1 mc2 = new HDCarEx1();

		System.out.println(mc1.model);
		test(mc1);
		System.out.println(mc1.model);
		test(mc2);
		System.out.println(mc2.model);
	}

}
