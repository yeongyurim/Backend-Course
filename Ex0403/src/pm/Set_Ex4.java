package pm;

import java.util.HashSet;
import java.util.Iterator;

// 인덱스가 없는 중복을 허용하지 않는 자료구조
public class Set_Ex4 {

	public static void main(String[] args) {
		// 정수를 저장하는 Set구조 생성
		HashSet<Integer> set1 = new HashSet<>();
		System.out.println("set1.size(): " + set1.size());
		
		if(set1.isEmpty())
			System.out.println("set1이 비었습니다.");
		else
			System.out.println("set1이 비어있지 않습니다.");
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(100); // 중복자원이므로 저장안됨!
		
		for(int i=0; i<10; i++) {
			set1.add(i);
		}
		if(set1.add(100)) {
			System.out.println("추가되었습니다.");
		} else {
			System.out.println("추가되지 않았습니다!");
		}
		
		// 200이라는 값을 삭제
		set1.remove(200);
		
		// set구조는 index값이 없기 때문에 반복자인 Iterator로 얻어내어
		// 반복처리 해야 한다.
		// generic 타입은 set구조와 동일한 자료형으로 설정해준다.
		Iterator<Integer> it = set1.iterator();
		
		// returns true if  the iteration has more elements
		while(it.hasNext()) {
			// hasNext함수는 커서가 있는 위치에서 바로 다음 칸에 
			// 자원이 있으면 true를 반환한다.
			int n = it.next(); // 반환 자료형이 지정했던 제네릭 타입에 따라 달라진다.
			// 다음 칸으로 이동하여 그곳에 있는 자원을 반환해줌.
			System.out.printf("%-4d", n);
		}
	}

}
