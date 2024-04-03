package ch12.sec04;

import java.util.Properties;
import java.util.Set;

/*
 * java.specification.version - 자바 스펙 버젼
 * java.home                  - JDK 디렉토리 경로
 * os.name                    - 운영체제
 * user.name                  - 사용자 이름
 * user.home                  - 사용자 홈 디렉토리 경로
 * user.dir                   - 현재 디렉토리 경로
 */
public class GetPropertyExample {

	public static void main(String[] args) {
		// 운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		// 전체 키와 값을 출력
		System.out.println("-------------------------");
		System.out.println(" key: value");
		System.out.println("-------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.printf("%-40: %s\n", key, value);
		}
	}

}

