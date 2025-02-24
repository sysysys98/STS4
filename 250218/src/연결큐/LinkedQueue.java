package 연결큐;

public class LinkedQueue {
	public Node front;
	public Node rear;
	
	//삽입
	public void enQ(int data) {
		//new node
		Node node = new Node(data);
		if(front == null) {//f,r 둘중 하나라도 null이면 공백
			front = rear = node; //일케 써도 됨, 둘다 node라는 뜻
		}else {
			rear.link = node;
			rear = rear.link;
			//윗줄은 rear = node;랑 똑같은 말임 라고하심 . .. ? ... ?
		}
		
	}
	
	//삭제
	public int deQueue() {
		if(front != null) {
			int data = front.data;
			front = front.link;
			return data;
		}
		
		return -1; //이것도 막하지마라 음수 조심
	}
	
	
}
