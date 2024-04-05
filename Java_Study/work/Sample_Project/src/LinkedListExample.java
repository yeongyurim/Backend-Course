import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList는 ArrayList와 사용 방법은 동일하지만 내부 구조는 완전히 다르다.
 * Arraylist는 내부 배열에 객체를 저장하지만, LinkedList는 인접 객체를 체인처럼 연결해서 관리한다.
 * 
 * LinkedList는 특정 위치에서 객체를 삽입하거나 삭제하면 바로 앞 뒤 링크만 변경하면 되므로
 * 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 좋은 성능을 발휘한다.
 */
public class LinkedListExample {

	public static void main(String[] args) {
		// ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<>();
		
		// LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		// 시작 시간과 끝 시간을 지정할 변수 선언
		long startTime;
		long endTime;
		
		// ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime));
		
		// ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime));
	}
	
	// 실행 결과를 보면 LinkedList가 훨씬 빠른 성능을 낸다.
	// ArrayList가 느린 이유는 0번 인덱스에 새로운 객체가 추가되면서 기존 객체의 인덱스를 한 칸씩 뒤로 미는 작업을 하기 때문이다.

}
