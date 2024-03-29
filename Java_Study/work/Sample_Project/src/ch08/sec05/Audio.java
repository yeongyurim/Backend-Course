package ch08.sec05;
/*
 * 구현 클래스에서 추상 메소드를 재정의할 때 주의할 점은 인터페이스의 추상 메소드는 기본적으로 public 접근 제한을 갖기 때문에
 * public 보다 더 낮은 접근 제한으로 재정의할 수 없다.
 * 그래서 재정의되는 메소드에는 모두 public이 추가 되어있다.
 */
public class Audio implements RemoteControl {
	// 필드
	private int volume;
	
	// turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	// turnOff() 추상 메소드 오버라이딩
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	// setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	// 필드
	private int memoryVolume;
	
	// default method 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제 합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
