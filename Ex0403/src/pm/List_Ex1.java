package pm;

import java.util.ArrayList;
/*
 * 언박싱 오토박싱을 통해
 * 해당 객체형의 원시 자료형으로 변환시에는 자동적으로 오토박싱된다.
 */
public class List_Ex1 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 정수만 저장하는 List구조 생성!
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		// 위는 배열과 같은 구조를 가졌으며 다른 점은  생성시 크기를 지정하지 않고, 추가 될 때(add)마다 크기가 늘어난다. 
		// 그리고 삭제시(remove)에는 크기가 줄어든다.
		// 중복을 허용하며 index로 접근한다.
		
		System.out.println("list1.size(): "+list1.size());
		list1.add(0);
		
		for(int i=1; i<10; i++) {
			list1.add(i);
		}
		
		// 반복문을 이용하여 출력하자
		for(int i=0; i<list1.size(); i++) {
			// 리스트구조에서 요소를 하나 얻어낼 때 
			int n = list1.get(i);
			System.out.println(n);
		} // for 의 끝
		System.out.println();
	
		list1.remove(5);
		for(int i=0; i<list1.size(); i++) {
			// 리스트구조에서 요소를 하나 얻어낼 때 
			int n = list1.get(i);
			System.out.println(n);
		} // for 의 끝
		
		// 인덱스가 6인 위치에 100을 저장하자!
		list1.add(6, 100);
		for(int i=0; i<list1.size(); i++) {
			// 리스트구조에서 요소를 하나 얻어낼 때 
			int n = list1.get(i);
			System.out.println(n);
		} // for 의 끝
		
		// 숫자 7이 있는 인덱스 값을 알아내자!
		int index = list1.indexOf(7);
		System.out.println("list1.indexOf(7):" + index );
		System.out.println("list1.size(): "+list1.size());
		
		// 현재 list구조가 비었는지? 판단!
		System.out.println(list1.isEmpty());
		list1.clear();
		System.out.println(list1.size());
	}

}
