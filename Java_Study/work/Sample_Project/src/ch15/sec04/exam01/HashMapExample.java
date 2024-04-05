package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map 컬렉션은 키와 값으로 구성된 엔트리 객체를 저장한다.
 * 여기서 키와 값은 모두 객체이다.
 * 키를 중복 저장할 수 없지만 값은 중복 저장할 수 있다.
 * 
 * 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치된다.
 * 
 * V put(K key, V value) - 주어진 키와 값을 추가, 저장이 되면 값을 리턴
 * 
 * boolean containersKey(Object key) - 주어진 키가 있는지 여부
 * boolean containersValue(Object value) - 주어진 값이 있는지 여부
 * Set<Map.Entry<K,V>> entrySet() - 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
 * V get(Object key) - 주어진 키의 값을 리턴
 * boolean isEmpty() - 컬렉션이 비어있는지 여부
 * Set<K> keySet() - 모든 키를 Set 객체에 담아서 리턴
 * int size() - 저장된 키의 총 수를 리턴
 * Collection<V> values() 저장된 모든 값 Collection에 담아서 리턴
 * 
 * void clear() 모든 Map.Entry(키와 값)를 삭제
 * V remove(Object key) - 주어진 키와 일치하는 Map.Entry 삭제, 삭제가 되면 값을 리턴
 */
public class HashMapExample {

	public static void main(String[] args) {
		
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}

}
