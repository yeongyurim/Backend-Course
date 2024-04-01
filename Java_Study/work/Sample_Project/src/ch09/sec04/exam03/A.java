package ch09.sec04.exam03;
/*
 * 로컬 변수(생성자 또는 메소드의 매개변수 또는 내부에서 선언된 변수)
 * 로컬 변수는 final 특성을 갖게 되므로 값을 읽을 수만 있고 수정할 수 없게 된다.
 * 이것은 로컬 변수내부에서 값을 변경하지 못하도록 제한하기 때문이다.
 * 
 * 명시적으로 final 키워드를 붙이지 않으면 자동으로 붙여진다.
 */
public class A {
	// 메소드 
	public void method1(int arg) { // final int arg
		// 로컬 변수
		int var = 1; // final int var = 1;
		
		// 로컬 클래스
		class B {
			// 메소드 
			void method2() {
				// 로컬 변수 읽기
				System.out.println("arg: "+ arg);
				System.out.println("var: "+ var);
				
				// 로컬 변수 수정
				//arg = 2;
				//var  =2
			}
		}
		
		// 로컬 객체 생성
		B b = new B();
		// 로컬 객체 메소드 호출
		// arg = 3;
		// var =3;
	}
}
