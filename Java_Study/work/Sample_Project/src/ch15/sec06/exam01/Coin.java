package ch15.sec06.exam01;

/*
 * Stack 클래스는 LIFO 자료구조를 구현한 클래스이다.
 * push - 주어진 객체를 스택에 넣는다.
 * pop - 스택의 맨 객체를 빼낸다.
 */
public class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
