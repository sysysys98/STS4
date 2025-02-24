import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack06_계산기 {
	public static void main(String[] args) {
		String infix = "(6+5*(2-8)/2)";
		
		//연산자 우선순위
		// ( : 겉바속촉
		// +, - : 1 (클수록 세다라고 가정)
		// *, / : 2
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('(', 0);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);
		
		StringBuilder postfix = new StringBuilder();
		
		//연산자 담을 스택
		Stack<Character> op = new Stack<>();
		
		//중위표기를 하나씩 읽어서 처리
		for(int i=0; i<infix.length(); i++) {
			//여는 괄호 ( 일 때
			if(infix.charAt(i) == '(') {
				//겉바->걍 추가 ㄱㄱ
				op.push(infix.charAt(i));
			}
			//닫는 괄호 ) 일때
			else if(infix.charAt(i) == ')') {
				//여는 괄호 만날 때까지 꺼내고, 버린다
				while(op.peek() != '(') {
					postfix.append(op.pop());
				}
				op.pop(); //여는 소괄호 버려줌
			}
			//피연산자일 때(한 자리 문자숫자라고 가정)
			else if (infix.charAt(i) >= '0' && infix.charAt(i)<='9') {
				postfix.append(infix.charAt(i));
			}
			
			//연산자일 때
			else {
				if(op.isEmpty()) { //스택 내부가 공백일 때
					op.push(infix.charAt(i));
				}
				//공백 아니면 연산자 우선순위를 비교해서 처리(작성해보기)
				else {//지금 내가 바라보고 있는 연산자의 우선순위가 스택에 있는거보다 작다면
					while(priority.get(op.peek()) >= priority.get(infix.charAt(i))){
						postfix.append(op.pop());
					}
					op.push(infix.charAt(i));
				}
			}
		}
		//스택에 남아있는 거 다 털어서 붙여주기
		while(!op.isEmpty()) {
			postfix.append(op.pop());
		}
		System.out.println(postfix);
		
		//계산해보자고///////////////////////////////////////////////////
		Stack<Integer> calc = new Stack<>(); 
		//뭐 위에 있는 스택 그대로 갖다가 형변환해서 계산해도 상관은 x
		
		for(int i=0; i<postfix.length(); i++) {
			//피연산자라면
			if(postfix.charAt(i) >= '0' && postfix.charAt(i)<='9') {
				calc.push(postfix.charAt(i)-'0');
			} 
			//연산자라면
			else {//꺼내는 순서 중요~
				int B = calc.pop();
				int A = calc.pop();
				
				switch(postfix.charAt(i)) {
				case '+':
					calc.push(A+B);
					break;
				case '-':
					calc.push(A-B);
					break;	
				case '*':
					calc.push(A*B);
					break;	
				case '/':
					calc.push(A/B);
					break;	
				}
			}			
		}
		System.out.println(calc.pop());
		
	}
}
