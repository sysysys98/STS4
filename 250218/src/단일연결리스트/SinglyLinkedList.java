package 단일연결리스트;

public class SinglyLinkedList {
	private Node head; //연결리스트의 시작점
	private int size; //
	
	
	public SinglyLinkedList() {
		//이 블록 부분은 없어도 괜찮음(어차피 기본값임)
		this.head = null;
		this.size = 0;
	}
	
	//조회
	public Node get(int idx) {
		//idx가 정상적인지 판단(음수인지, size를 벗어나진 않았는지...)
		if(idx<0 || idx>=size) {
			//예외를 발생시키거나 혹은 null 리턴
			//혹은 뭐
			//idx<0 : 그냥 0번 인덱스
			//idx >= size : 마지막 인덱스
			//이렇게 내놓는 식으로 만들어진 경우도 있음
			return null;
		}
		
		Node curr = head; //current //얕복
		
		//curr 해당 노드를 idx 위치까지 옮기겠다
		for(int i=0; i<idx; i++) {
			curr = curr.link; //curr를 curr가 가진 링크로 옮기겠다	
		}
		
		return curr;
	}
		
	//노드 추가(처음, 중간, 끝)
	//data가 필요한데 Node가 가질 수 있는 데이터여야함
	//Node를 파라미터로 갖고 있어도 가넝
	public void addFirst(String data) {
		//1. 노드를 생성한다.
		Node node = new Node(data);
		
		//2. 노드의 링크는 head
		node.link = head;
		
		//3. head를 새로 만든 node로 바꾼다.
		head = node;
		size++;
	}
	
	public void addLast(String data) {
		if(size == 0) {
			addFirst(data);
			return;
		}
		
		Node node = new Node(data);
	}
	
	public void add(int idx, String data) {
		//여기 뭐 더잇엇는데 못적엇어...
		//라이브 코드 다시 보기
		if(idx == 0) {
			addFirst(data);
			return;
		}
		
		if(idx ==size) {
			addLast(data);
			return;
		}
		
		//내가 넣고 싶은 위치의 이전 노드를 가져와야 한다.
		Node pre = get(idx-1); //get을 만들어놨으니 활용 ㄱㄱ
		
		Node node = new Node(data);
		
		//순서 중요
		node.link = pre.link;
		pre.link = node;
		
		size++;
	}
	
	public String remove() {
		if(head == null) {
			//예외 발생 시켜도 ㄱㅊ 아님 널 반환
			return null;
		}
		
		String data = head.data;
		head = head.link;
		size--;
		return data;
	}
	
	//메서드 오버로딩(중간에잇는거 지워보자)
	public String remove(int idx) {
		if(idx == 0) return remove();
		
		//범위를 벗어났으면...
		
		if(idx < 0 || idx >= size) return null;
		
		Node pre = get(idx-1);
		Node rm = pre.link; //get(idx)로 갖고오는 것보다 이게 더 효율적
		
		String data = rm.data; //==pre.link.data
		pre.link = rm.link; //==pre.link.link
		size--;
		
		return data;
	}
	
	public void printList() {
		Node curr = head;
		
		if(head ==null) {
			System.out.println("공백이얌");
			return;
		}
		
		while(curr != null) {
			System.out.print(curr.data+"->");
			curr = curr.link;
		}
		
		System.out.println();
	}
}
		
	

