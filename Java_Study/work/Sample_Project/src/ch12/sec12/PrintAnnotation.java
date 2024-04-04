package ch12.sec12;

// 코드에서 @으로 작성되는 요소를 어노테이션이라고 한다.
// 어노테이션은 클래스 또는 인터페이스를 컴파일하거나 실행할 때 어떻게 처리해야 할 것인지를 알려주는 설정 정보이다.
/*
 * 1. 컴파일시 사용하는 정보 전달
 * 2. 빌드 툴이 코드를 자동으로 생성할 때 사용하는 정보 전달
 * 3. 실행시 특정 기능을 처리할 때 사용하는 정보 전달
 */

/*
 * 어노테이션 유지정책
 * SOURCE 컴파일할 때 적용 컴파일된 후에 제거됨
 * CLASS 메모리로 로딩할 때 적용 메모리로 로딩된 후에 제거됨
 * RUNTIME 실행할 때 적용
 */

/*
 * 어노테이션 설정 정보 이용
 * boolean isAnnotationPresent(AnnotationName.class) 지정한 어노테이션이 적용되었는지 여부
 * Annotation getAnnotation(AnnotationName.class) 지정한 어노테이션이 적용되어 있으면 어노테이션을 리턴하고, 그렇지 않다면 null을 리턴
 * Annotation[] getDeclaredAnnotations() 적용된 모든 어노테이션을 리턴
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
 * 적용대상: METHOD
 * 유지정책: RUNTIME
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-"; // 값을 초기화하지 않으면 default값으로 설정
	int number() default 15;
}
