package 데크;

//제네릭 ㄱㄱ
public class LinkedListDeque<T> {
	//내부에 Node를 정의해놓고 써보장
	private class Node{ //뭐 밖에서쓸일없으니까 private로 해보장
		T data; //내부클래스니까 위ㅣ에서 쓴 T 나도 쓸래 가능
		Node prev;
		Node next;
		Node(T data){
			this.data = data;
		}
	}//node 클래스 정의
	
	private Node front; 
	private Node rear;
	private int size;
	
	//기본 생성자 작성하진 않을 건데
	//상상이 가능해야 함
	
	//공백 확인
	public boolean isEmpty() {
		return size==0;
		//뭐 작성법은 다양합니당 front나 rear 활용해도 ㅇㅋ
	}
	
	public int size() {
		return size; //아니면 size를 public으로 풀어버려서 바로 부르는 방법도 ㅇㅋ
	}
	
	//맨앞에 삽입
	public void addFirst(T item) {
		Node node = new Node(item);
		if(isEmpty()) {
			front = rear = node;
		} else {
			node.next = front; //노드 다음에 프론트 꽂고
			front.prev = node; //프론트의prev에 노드 꽂고
			front = node; //노드에 프론트를 꽂고
		}
		size++;
		
	}
	
	//뒤쪽에 새 원소 삽입
	public void addLast(T item) {
		Node node = new Node(item);
		if(isEmpty()) {
			//addFirst 호출해도 되지만 굳이?
			front = rear = node;
		} else {
			rear.next = node;
			node.prev = rear;
			rear = node;
		}
		size++;		
	}
	
	//앞쪽 노드 삭제
	public T removeFirst() {
		if(isEmpty()) return null;
		
		T data = front.data;
		if (size == 1) {
			front = null;
			rear = null;			
		} else {
			front = front.next;
			front.prev = null;
		}
		size--;
		return data;
	}
	
	//뒤쪽 노드 ㅂㅂ
	public T removeLast() {
		if(isEmpty()) return null;
		
		T data = rear.data;
		if (size == 1) {
			front = rear = null;		
		} else {
			rear = rear.prev;
			rear.next = null;
		}
		size--;
		return data;
	}

	//peek
	public T peekFirst() {
		if(isEmpty()) return null;
		return front.data;
	}
	
	public T peekLast() {
		if(isEmpty()) return null;
		return rear.data;
	}
}
