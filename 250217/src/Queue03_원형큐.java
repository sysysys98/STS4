import java.util.Arrays;

public class Queue03_원형큐 {
	//한칸 비워두는 방식 사용해서 만들 예정
	public static String[] cQ = new String[5];
	public static int front = 0, rear = 0;
	
	public static void main(String[] args) {
		System.out.println(enQueue("롸롸"));
		System.out.println(enQueue("asdfafsd"));
		System.out.println(enQueue("ㅁㄴㅇㄹ;ㅣㅓㅏㅁㄹㄴ어;ㅣㅏ"));
		System.out.println(enQueue("우에에에엥"));
		System.out.println(enQueue("크아아악"));
		
		System.out.println(Arrays.toString(cQ));
	}
	
	//삽입
	public static boolean enQueue(String item) {
		if(isFull()) {
			System.out.println("자리 없엉");
			return false;
		}
		rear = (rear+1)%cQ.length; //rear+1하고싶어도 회전될 수 있으니까~
		cQ[rear] = item;
		return true;
	}
	
	//삭제
	public static String deQueue() {
		if(isEmpty()) {
			System.out.println("암것도 없엉");
			return null;
		}
		front = (front+1) % cQ.length;
		return cQ[front];
	}
	
	//공백
	public static boolean isEmpty() {
		return front==rear; //요건 선형큐와 똑같다
	}
	
	//포화
	public static boolean isFull() {
		return front == (rear+1)%cQ.length;
	}
}
