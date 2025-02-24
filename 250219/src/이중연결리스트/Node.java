package 이중연결리스트;

public class Node {
	public String data;
	public Node prev; //이전주소
	public Node next; // 다음 주소
	
	public Node(String data) {
		this.data = data;
		this.prev = this.next = null; //이건 뭐 안 써도 똑같죠
	}
}
