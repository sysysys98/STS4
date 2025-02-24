import java.util.Arrays;

class MyStack<E>{
	
	
}


public class Stack02_배열구현 {
	//배열을 이용해서 스택을 직접 만들기
	static String[] stack = new String[10];
	//크기를 몇으로 할까?는 문제를 보고 판단하거나(주어지는 모든 걸ㅊ 담을 수 있어야 함)
	//모르겟으면 10만~100만정도 ㄱㄱ
	static int top = -1; //1개 들어가면 그거의 인덱스가 0이니까 공백은 -1이어야함
	
	public static void main(String[] args) {
		
		push("짜장면");
		push("탕수육");
		push("수제비");
		
//		System.out.println(Arrays.toString(stack));
		System.out.println(peek());
		
		
		
		
	}
	
	//삽입(push)
	static boolean push(String value) {
		if(isFull()) {
			System.out.println("가득 차 있어... 미안해");
			return false;
			//여기서 바로 false 하지 않고 
			//확장을 가능하게 할 거면(크기 제한 안 둘 거면) 배열을 두배로 늘려서 다시 복사해도 ㄱㅊ
		}
		stack[++top] = value;
		
		return true;
	}
	
	//삭제(pop)
	static String pop() {
		if(isEmpty()) {
			System.out.println("암것도 없어 미안해~");
			return null;
		}
		return stack[top--];
	}
	
	//조회(peek)
	static String peek() {
		if(isEmpty()) {
			System.out.println("공백인데?");
			return null;
		}
		return stack[top];
	}
	
	//공백(empty)
	static boolean isEmpty() {
		return top==-1; //스택을 클래스.java로 만들었으면 this.top 해야함
	}
		
	//포화(full) <-배열로 만들었으니까 꽉차면 못넣음
	static boolean isFull() {
		return top == stack.length-1; //배열이니까 length
	}
	
	
}
