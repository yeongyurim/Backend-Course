package ch09.sec06.exam02;
/*
 * 외부에서 접근이 가능하도록 public이면서 Button 객체 없이 사용할 수 있는 static 중첩 인터페이스로 ClickListener를 선언했다.
 * 그리고 추상 메소드인 onClick()을 선언했다.
 * onClick()메소드는 버튼이 클릭되었을 때 호출될 메소드이다..
 */
public class Button {
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		// 추상 메소드
		void onClick();
	}
	
	// 필드 
		private ClickListener clickListener;
		
		// 메소드
		public void setClickListener(ClickListener clickListener) {
			this.clickListener = clickListener;
		}
}
