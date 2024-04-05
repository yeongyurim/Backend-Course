package ch15.sec04.exam03;

import java.util.Properties;

/*
 * Properties는 Hashtable의 자식 클래스이기 때문에 
 * Hashtable의 특징을 그대로 가지고 있다.
 * Properties는 키와 값을 String 타입으로 제한한 컬렉션이다.
 * 
 * 주로 확장자가 .properties인 프로퍼티 파일을 읽을 때 사용한다.
 * 포로퍼티 파일은 키와 값이 = 기호로 연결되어 있는 텍스트 파일이다.
 */

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		// Properties 컬렉션 생성
		Properties properties = new Properties();
		
		// PropertiesExample.class와 동일한 ClassPath에 있는 database.properties 파일 로드
		properties.load(PropertiesExample.class.getResourceAsStream
				("database.properties"));
		
		// 주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		// 주어진 키에 대한 값 읽기
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
	}

}
