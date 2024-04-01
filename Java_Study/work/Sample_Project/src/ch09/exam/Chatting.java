package ch09.exam;

public class Chatting {
	class Chat {
		void start() {}
		void sendMessage(String message) { }
	}
	// 로컬 변수 (생성자 또는 메소드의 매개변수 또는 내부에서 선언된 변수)를 로컬 클래스에서 사용할 경우 로컬 변수는
	// final 특성을 갖게 되므로 값을 읽을 수만 있고 수정할 수 없게 된다.
	// 이것은 로컬 클래스 내ㅜㅂ에서 값을 변경하지 못하도록 제한하기 때문이다.
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					//String message = "[" + nickName + "]" + inputData;
					//sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}
