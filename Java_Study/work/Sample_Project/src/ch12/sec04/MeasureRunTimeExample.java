package ch12.sec04;

import javax.swing.JButton;

/*
 * System 클래스의 currentTimeMillis() 메소드와 nanoTime() 메소드는 1970년 1월 1일 0시부터 시작해서 진행된 시간을 리턴한다.
 * long currentTimeMillis() 1/1000 초 단위로 진행된 시간을 리턴
 * long nanoTime() 1/10^9초 단위로 진행된 시간을 리턴 
 */
public class MeasureRunTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		int sum = 0;
		// bt = new JButton("생성")
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1-1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2-time1) + "나노초가 소모되었습니다.");
	}

}
