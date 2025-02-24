import java.util.ArrayDeque;
import java.util.Deque;

public class Collection06_DequeTest {
	public static void main(String[] args) {
		
		//양방향 큐
		Deque<String> dq = new ArrayDeque<>();
		
		dq.addFirst("유아름");
		dq.addLast("박승연");
		dq.addFirst("이정은");
		
		System.out.println(dq);
	}
}
