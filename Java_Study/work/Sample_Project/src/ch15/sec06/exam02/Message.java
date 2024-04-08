package ch15.sec06.exam02;

/*
 * Queue 인터페이스는 FIFO 자료구조에서 사용되는 메소드를 정의하고 있다.
 * 
 * boolean offer(E e) 주어진 객체를 큐에 넣는다.
 * E poll() 큐에서 객체를 빼낸다.
 */
public class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
