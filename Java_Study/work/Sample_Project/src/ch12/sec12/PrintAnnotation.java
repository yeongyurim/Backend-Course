package ch12.sec12;

// 코드에서 @으로 작성되는 요소를 어노테이션이라고 한다.
// 어노테이션은 클래스 또는 인터페이스를 컴파일하거나 실행할 때 어떻게 처리해야 할 것인지를 알려주는 설정 정보이다.
/*
 * 1. 컴파일시 사용하는 정보 전달
 * 2. 빌드 툴이 코드를 자동으로 생성할 때 사용하는 정보 전달
 * 3. 실행시 특정 기능을 처리할 때 사용하는 정보 전달
 */

/*
 * 어노테이션 적용대상
 * 어느테이션
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target{ElementType.
public class PrintAnnotation {

}
