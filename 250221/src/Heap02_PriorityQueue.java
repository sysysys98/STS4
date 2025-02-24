import java.util.PriorityQueue;

public class Heap02_PriorityQueue {
	public static void main(String[] args) {
		//기본은 최소힙이지만 비교기준 넣으면 최대힙으로도 쓸 수 있음
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(19);
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
