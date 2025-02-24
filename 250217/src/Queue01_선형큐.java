
class MyQueue {
	
}


public class Queue01_선형큐 {
	public static int[] q = new int[10];
//	public static int front = -1; //데이터 삭제를 위한 위치
//	public static int rear = -1; //데이터 삽입 위치
	public static int front = -1, rear = -1; //자료형 같으면 이렇게 한줄에도 ㅇㅋ
	
	public static void main(String[] args) {
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);
		
		System.out.println(deQueue());
		
	}
	
	//삽입
	public static void enQueue(int item) {
		if(isFull()) {
			System.out.println("미안해~~ 자리가없어");
		} else {
			q[++rear] = item;
		}
	}
		
	//삭제
	public static int deQueue() {
		if(isEmpty()) {
			System.out.println("암것도 없어");
			return -1; //만약에 큐 안에 음수가 있으면 -1 내놓으면 안돼잇
			//만일 반환 타입이 Integer(랩핑클래스)라면
			//null반환도 가능
		}
		return q[++front];
	}
	
	//공백
	public static boolean isEmpty() {
		return front == rear;
	}
	
	//포화
	public static boolean isFull() {
		return rear == q.length-1;
	}
}
