package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		// 10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3; // 키워드 double은 float보다 약 2배의 정밀도를 가진다는 의미에서 이름이 붙여진 것이다.
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}
