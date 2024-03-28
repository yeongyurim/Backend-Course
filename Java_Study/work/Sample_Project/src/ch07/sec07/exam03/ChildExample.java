package ch07.sec07.exam03;

// 자식 타입은 부모 타입으로 자동 변환되지만, 반대로 부모타입은 자식타입으로 자동 변환되지 않는다.
// 대신 캐스팅 연산자로 강제 타입 변환을 할 수 있다.

// 부모 타입 객체를 자식 타입으로 강제 변환하기 위해서는
// 부모 타입 객체를 자식 타입 객체로 자동 변환 시킨 후 다시 자식 타입으로 변환 하면 강제 타입 변환을 사용할 수 있다.
// 자식 객체가 부모 타입으로 자동 변환하면 부모 타입에 선언된 필드와 메소드만 사용가능하다는 제약이 따른다.
// 만약 자식 타입에 선언된 필드와 메소드를 꼭 사용해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로 변환해야 한다.

public class ChildExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		Parent parent = new Child();
		
		// 메소드 호출
		parent.method1();
		parent.method2();
		// parent.method3(); (호출 불가능);
		
		// 강제 타입 변환
		Child child = (Child) parent;
		
		// Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
	}

}
