import java.util.Stack;

public class Stack03_괄호검사 {
	public static void main(String[] args) {
		String str = "()()()(()((())))";//올바른거
		
		//괄호검사
		//1. 괄호 개수는 동일해야 함(열고 닫는 괄호가 서로)
		//2. 여는 괄호는 닫는 거보다 먼저 나와야 함
		//3. 괄호는 포함관계여야 함(서로 교차되면 안됨 ([)] 이런거 안됨
		
		Stack<Character> stack = new Stack<>();
		boolean isOk = true; //t/f 어떤 값으로 초기화할진 목적을 잘 생각해서 정하기~
		
		for(int i=0; i<str.length(); i++) {
			//1. 여는 괄호라면.. 무조건 넣어 (, {, [, <
			if(str.charAt(i) == '('){
				stack.push(str.charAt(i));
			} 
			//2. 닫는 괄호라면... 고민 포인트,,,
			else { //만약 문제에서 괄호류 말고 다른 문자도 온다면 else if로 조건 더 줘야함
				//2-1. 스택이 공백이라면? : 닫는 게 먼저 들어옴
				if(stack.isEmpty()) {
					isOk = false;
					break;
				} else {
					char c = stack.pop(); //검사
					
				}
			}			
		}
		
		//!isOk거나 스택에 여는 괄호가 남아 있으면 오답!
		if(isOk && stack.isEmpty()) {
			System.out.println("정답");
		} else {
			System.out.println("땡!");
		}
	}
}
