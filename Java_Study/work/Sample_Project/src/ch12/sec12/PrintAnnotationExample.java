package ch12.sec12;

import java.lang.reflect.Method;

/*
 * 어노테이션 적용 대상
 * 
 * 어떤 대상에 설정 정보를 적용할 것인지, 즉 클래스에 적용할 것인지, 메소드에 적용할 것인지를 명시해야 한다.
 * 적용할 수 있는 대상의 종류는 ElementType 열거 상수로 정의되어 있다.
 * 
 * TYPE  클래스, 인터페이스, 열거 타입
 * ANNOTATION_TYPE 어노테이션
 * FIELD 필드
 * CONSTRUCTOR 생성자
 * METHOD 메소드
 * LOCAL_VARIABLE 로컬 변수
 * PACKAGE 패키지
 */
public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			// PrintAnntation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation
					(PrintAnnotation.class);
			
			// 설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			// 메소드 호출
			method.invoke(new Service());
			
			// 설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			// number 속성값 얻기
			int number = printAnnotation.number();
			for(int i=0; i<number; i++) {
				// value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
