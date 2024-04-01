package ch09.sec06.exam01;

/* 
 * 즁첩 인터페이스는 클래스의 멤버로 선언된 인터페이스를 말한다.
 * 인터페이스를 클래스 내부에 선언하는 이유는 해당 클래스와 긴밀한 관계를 맺는 구현 객체를 만들기 위해서이다.
 * 
 * 외부의 접근을 막지 않으려면, public을 붙이고 A 클래스 내부에서만 사용하려면 private을 붙인다. 
 * 접근 제한자를 붙이지 않으면 같은 패키지 안에서만 접근이 가능하다.
 */
public class Button {
	// 정적 중첩 인터페이스
	public static interface ClickListener {
		// 추상 메소드
		void onClick();
	}
}
