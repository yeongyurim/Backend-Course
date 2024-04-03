package am;

public class Main_Ex2 {

	public static void main(String[] args) {
		// 프로그램 시작
		// 원한느 객체 생성
		Gen_Ex2 <String> data = new Gen_Ex2<String>();
		data.setValue("100");

		System.out.println(data.getValue()+1); // 1001
		
		Gen_Ex2<Integer> data2 = new Gen_Ex2<Integer>();
		data2.setValue(100);
		
		System.out.println(data2.getValue()+1); // 101
	}

}
