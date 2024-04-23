package ch16.sec05.exam01;

/*
 * 메소드 참조는 말 그대로 메소드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내 람다식에서 불필요한 매개변수를 제거하는 것을
 * 목적으로 한다.
 */
public class Person {
	public void action(Calculable calculable) {
		double result = calculable.calc(10, 4);
		System.out.println("결과: " + result);
	}
}
