package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 정적 메소드일 경우
		// 람다식
		//person.action((x,y) -> Computer.staticMethod(x, y));
		
		// 람다식은 단순히 두 개의 값을 Math.max() 메소드의 매개값으로 전달하는 역할만 하기 때문에 메소드 참조하를 이용하여 깔끔하게 처리할 수 있다.
		// 메소드 참조
		// 정적 메소드를 참조할 경우에는 클래스 이름 뒤에 :: 기호를 붙이고 정적 메소드 이름을 기술한다.
		person.action( Computer :: staticMethod );
		
		// 인스턴스 메소드일 경우에는 먼저 객체를 생성한 다음 참조 변수 뒤에 :: 기호를 붙이고 인스턴스 메소드 이름을 기술한다.
		
		// 인스턴스 메소드일 경우
		Computer com = new Computer();
		person.action( com :: instanceMethod );
	}

}
