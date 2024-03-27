package ch06.sec11.exam02;
// 패키지 디렉토리는 클래스를 컴파일하는 과정에서 자동으로 생성된다.
// 컴파일러는 클래스의 패키지 선언을 보고 디렉토리를 자동 생성시킨다.
// 패키지 선언은 package 키워드와 함께 패키지 이름을 기술한 것으로, 항상 소스 파일 최상단에 위치해야 한다.
// 패키지 이름은 모두 소문자로 작성하는 것이 관례이다.
// 그리고 패키지 이름이 서로 중복되지 않게끔 회사 도메인 이름의 역순으로 작성하고, 마지막에는 프로젝트 이름을 붙여주는 것이 일반적이다.

// 같은 패키지에 있는 클래스는 아무런 조건 없이 사용할 수 있지만, 다른 패키지에 있는 클래스를 사용하려면 import 문을 이용해서 어떤 패키지의 클래스를
// 사용하는지 명시해야한다.
public class EarthExample {

	public static void main(String[] args) {
		// 상수 읽기
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km^2");
	}
}
