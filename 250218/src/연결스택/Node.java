package 연결스택;

public class Node {
	public int data;
	public Node link; //다음 주소의 값
	
	public Node() {}
	public Node(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}
	
	

}
