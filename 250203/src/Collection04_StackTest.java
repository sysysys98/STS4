import java.util.Stack;

public class Collection04_StackTest {
	public static void main(String[] args) {
		
//		Vector<Integer> stack = new Stack<>(); 이렇게는 쓰지 않아
		Stack<Integer> stack = new Stack<>();
		
		stack.add(1);
		stack.add(2);
		
		System.out.println(stack.pop());
	}
}
