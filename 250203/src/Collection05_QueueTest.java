import java.util.LinkedList;
import java.util.Queue;

public class Collection05_QueueTest {
	public static void main(String[] args) {
		//큐는 인터페이스라 LinkedList나 ArrayDeque를 마니쓴당
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1); //실패 반환
		q.offer(2); //예외 발생
		
		System.out.println(q.poll()); //비어 있으면 null
		System.out.println(q.remove()); //예외발생
		System.out.println(q.poll()); //비어 있으면 null
		System.out.println(q.remove()); //예외발생
	}
}
