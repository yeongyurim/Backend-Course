package ch12.sec03.exam04;
/*
 * 데이터 전달을 위한 DTO(Data Transfer Object)를 작성할 때 반복적으로 사용되는 코드를 줄이기 위해 Java 14부터 record가 도입되었다.
 * 이렇게 선언된 레코드 소스를 컴파일하면 변수의 타입과 이름을 이용해서 private final 필드가 자동으로 생성되고, 생성자 및 Getter 메소드가 자동으로 추가된다.
 * 그리고 hashCode(), equals(), toString() 메소드를 재정의한 코드도 자동으로 추가된다.
 */
public record Member(String id, String name, int age) {

}
