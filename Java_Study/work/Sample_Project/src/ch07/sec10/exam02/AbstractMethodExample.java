package ch07.sec10.exam02;

// 자식 클래스들이 가지고 있는 공통 메소드를 뽑아내어 추상 클래스로 작성할 때, 메소드 선언부(리턴타입, 메소드명, 매개변수)만 동일하고 
// 실행 내용은 자식 클래스마다 달라야 하는 경우가 많다.
// 예를 들어 동물은 소리를 내기 때문에 Animal 추상 클래스에서 sound()라는 메소드를 성너할 수 있지만, 실행 내용인 소리는 동물마다 다르기 때문에 
// 추상 클래스에서 통일하여 작성할 수 없다.
// 일반 메소드 선언과의 차이점은 abstract 키워드가 붙고, 메소드 실행 내용인 중괄호가 없다.
public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		// 매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound( Animal animal ) {
		animal.sound(); // 재정의된 메소드 호출
	}

}
