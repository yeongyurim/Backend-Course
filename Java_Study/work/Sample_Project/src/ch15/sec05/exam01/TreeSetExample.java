package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * TreeSet은 이진 트리를 기반으로 한 Set 컬렉션이다.
 * 이진 트리는 여러 개의 노드가 트리 형태로 연결된 구조로, 루트 노드라고 불리는 하나의 노드에서 시작해
 * 각 노드에 최대 2개의 노드를 연결할 수 있는 구조를 가지고 있다.
 * 
 * TreeSet에 객체를 저장하면 자동적으로 자신보다 낮은 것은 왼쪽 자식에 높은 것은 오른쪽 자식 노드에 저장한다.
 */

/*
 *  E first() - 제일 낮은 객체를 리턴
 *  E last() - 제일 높은 객체를 리턴
 *  lower() - 주어진 객체보다 바로 아래 객체를 리턴
 *  highter - 주어진 객체보다 바로 위 객체를 리턴
 *  floor() 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 아래의 객체를 리턴
 *  ceiling - 주어진 객체와 동등한 객체가 있으면 리턴 만약 없다면 주어진 객체의 바로 위의 객체를 리턴
 *  pollFirst - 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
 *  pollLast - 제일 높은 객체를 꺼내오고 컬렉션에서 제거함
 *  descendingIterator - 내림차순으로 정렬된 Iterator를 리턴
 *  descendingSet - 내림차순으로 정렬된 NavigableSet을 리턴
 *  headSet - 주어진 객체보다 낮은 객체들을 NavigableSet으로 리턴, 주어진 객체 포함 여부는 두 번째 매개값에 따라 달라짐
 *  subSet - 시작과 끝으로 주어진 객체 사이의 객체들을 NavigableSet으로 리턴
 */
public class TreeSetExample {

	public static void main(String[] args) {
		
	}

}
