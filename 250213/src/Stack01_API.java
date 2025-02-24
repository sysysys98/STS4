import java.util.Stack;

public class Stack01_API {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		for(int i=0; i<stack.size(); i++) {
			System.out.println(stack.pop());
		}
		
		System.out.println(stack.isEmpty()); //false나옴
		//스택은 pop하면 계속 사이즈가 변하니까
		//위 같은 조건을 줘버리면 제대로 다 팝할수없음!
		
		while(!stack.isEmpty()) {}
		//아니면
		int size = stack.size();
		//이렇게 저장하고 ㄱㄱ for문
		
		for(int i=stack.size(); i>=0; i--) {
			//이렇게도?
		}
		
	}
}
