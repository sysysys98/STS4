import java.util.LinkedList;
import java.util.Queue;

public class Queue02_API {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(); //보통은 이렇게 많이
		//ArrayDeque<>도 요즘은 마니쓴다함
		//참조자료형으로 q를 쓰는 것을 통해서 LL에 대해 접근 가능한 메서드를 제한하는 느낌
		//내 목적은 q를 만들고 다루는 거니깐!
		
		
		//추가
		q.add(1);
		q.offer(2);
		
		//삭제
		q.remove();
		q.poll();
		
		//조회
		q.element();
		q.peek();
		
		//윗줄: 예외발생
		//아랫줄: 값을 리턴(값이 없으면 null 반환)
		
	}
}
