import java.util.ArrayDeque;
import java.util.Deque;

import 데크.LinkedListDeque;

public class LinkedList07_데크 {
	public static void main(String[] args) {
		LinkedListDeque<Integer> dq = new LinkedListDeque<>();
		
		dq.addFirst(10);
		System.out.println(dq.removeFirst());
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.add(null);
		deque.removeFirst();
	}
}
