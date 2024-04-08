package ch17.sec03;
/*
 * 스트림은 하나 이상 연결될 수 있다.
 * 컬렉션의 오리지널 스트림 뒤에 필터링 중간 스트림이 연결될 수 있고, 그 뒤에 매핑 중간 스트림이 연결될 수 있다.
 * 이와 같이 스트림이 연결되어 있는 것을 스트림 파이프라인이라고 한다.
 * 
 * 오리지널 스트림과 집계 처리 사이의 중간 스트림들은 최종 처리를 위해 요소를 걸러내거나(필터링), 요소를 변환시키거나(매핑),
 * 정렬하는 작업을 한다. 최종 처리는 중간 처리에서 정제된 요소들을 반복하거나, 집계(카운팅, 총합, 평균) 작업을 수행한다.
 */
public class Student {
	private String name;
	private int score;
	
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
}
