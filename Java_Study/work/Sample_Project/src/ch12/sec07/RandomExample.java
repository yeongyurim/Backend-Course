package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

/*
 * Random() - 현재 시간을 이용해서 종자값을 자동 설정한다.
 * Random(long seed) - 주어진 종자값을 사용한다.
 * 
 * 종자값이란 난수를 만드는 알고리즘에 사용되는 값으로, 종자값이 같으면 같은 난수를 얻는다.
 * 
 * boolean nextBoolean()
 * double nextDouble() - double 타입의 난수를 리턴 0.0<=<1.0
 * int nextInt() - int 타입의 난수를 리턴 -2^32 <=  < 2^32-1;
 * int nextInt(int n) - int 타입의 난수를 리턴 0<= < n
 */
public class RandomExample {

	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(5);
		System.out.print("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
