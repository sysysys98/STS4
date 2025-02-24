package 연결스택;

public class LinkedStack {
	public Node top; //포인터 변수 하나 필요
	
	//삽입
	public void push(int data) {
		Node node = new Node(data); //새로운 노드 생성
		//데이터를 누르자
		node.link = top ; //top이 가리키는 주소를 넣는다.
		top = node;
	}
	
	
	//삭제
	public int pop() {
		if(top == null) { //공백 스택
			return -1; //문제 범위 고려해야 함(무조건 -1 내놓으면 x)
		}
		int data = top.data; //데이터부터 건지고
		top = top.link; //top 이동
		return data;
			
	}
	
	public int peek() { //악놓쳣다
		if(top==null) return 0; //이거아님
		return 1;
		//더잇음
	}
	
	//조회
	//여기도더있음,,
	
}
