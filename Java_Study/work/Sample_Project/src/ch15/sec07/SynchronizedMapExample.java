package ch15.sec07;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * 동기화된 컬렉션
 * ArrayList와 HashSet, HashMap은 동기화된 메소드로 구성되어 있지 않아 멀티 스레드 환경에서 안전하지 않다.
 * 경우에 따라서는 ArrayList, HashSet, HashMap을 멀티스레드 환경에서 사용해야한다면
 * Collections의 synchronizedXXX() 메소드를 제공한다.
 * 
 * 리턴 타입		메소드(매개변수)		설명
 * List<T>	synchronizedList(List<T> list)	List를 동기화된 List로 리턴
 * Map<K,V>	synchronizedMap(<Map<K,V> m)	Map을 동기화된 Map으로 리턴
 * Set<T>	synchronizedSet(Set<T> s) 		Set을 동기화된 Set으로 리턴	
 */
public class SynchronizedMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		
		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					map.put(i, "내용"+i);
				}
			}
		};

		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for(int i=1001; i<=2000; i++) {
					map.put(i, "내용"+i);
				}
			}
		};
		
		// 작업 스레드 실행
		threadA.start();
		threadB.start();
		
		// 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 저장된 총 객체 수 얻기
		int size = map.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
	}

}
