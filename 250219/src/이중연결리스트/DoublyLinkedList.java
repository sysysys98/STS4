package 이중연결리스트;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	 
	//조회
	
	public Node get(int idx) {
		if(idx < 0 || idx >= size) {
			//널하든가 예외처리
			return null;
		}
		
		Node curr; //요건 지역변수(찾을 위치를 지정한 것뿐이라 new 여긴 필요  없음)
		//걍 int idx 이런 느낌으로 선언해준거임
		
		//꼭 아래처럼 하지 않아도 되지만 효율적으로 탐색하기 위해!
		//앞에서부터 찾는 경우(idx가 반절보다 작으면 앞부터 뒤지자)
		if(idx < size/2) {
			curr = head;
			for(int i=0; i<idx; i++) {
				curr = curr.next; //idx가 2면 1=2 이렇게까지 가겟네
			}
		}		
		//뒤에서부터 찾는 경우
		else {
			curr = tail;
			//조건식 계산해서 0부터 00회 돌리면 가능
			//예를 들어 size=5고 idx3을 찾는거면 4까지만 내려가도 prev가 3이라 찾아짐
			for(int i= size-1; i>idx; i--) {
				curr = curr.prev;
			}			
		}
		return curr;
	}
	
	//첫번째 위치에 삽입
	public void addFirst(String data) {
		Node node = new Node(data);
		
		node.next = head;
		//공백이 아니라면
		if(head != null) {
			head.prev = node;			
		}
		head = node;
		size++;
		
		//만약 노드가 1개뿐이면?
		if(head.next == null) { //혹은 size ==1
			tail = head; //tail을 쓸거면 같이 관리를 꼭 해주기
		}
	}
	
	//마지막 위치에 삽입
	public void addLast(String data) {		
		if(size == 0) {
			addFirst(data); //공백이면 addFirst랑 동작 똑같으니까 걍 ㄱㄱ
			return;
		}
		Node node = new Node(data);
		
		//tail의 next를 node에 연결하고 
		//node의 다음은 null이 되겠고
		//node의 이전은 tail이 됨
		//그다음 tail을 node로 옮김
		
		tail.next = node;
		node.prev = tail;
		tail = node;
		size++;
	}
	
	//중간 위치에 삽입
	public void add(int idx, String data) {
		if(idx <0 || idx > size) return; //예외처리 하든가~
		if(idx == 0) {
			addFirst(data); //앞에다 넣는거랑 똑같져
			return;
		}
		if(idx == size) {
			addLast(data);
			return;
		}
		
		//편하게 하려면 idx의 앞뒤를 다 알고 있으면 편함 앞만 알아도 가능은 함
		Node prevNode = get(idx-1);
		Node nextNode = prevNode.next;
		Node node = new Node(data);
		
		prevNode.next = node;
		node.prev = prevNode; 
		//교안이랑 좀 다른데 이 방식은 next를 미리 알아놔서 가능한것임(next 모르면 좀더 복잡)
		
		node.next = nextNode;
		nextNode.prev = node;
		size++;		
	}
	
	//첫번째 위치 삭제(오버로딩 ㄱㄱ)
	public String remove() {
		if(head == null) // size == 0
			return null;
		
		String data = head.data; //우리는 head==첫번째노드 방식으로 짰으니...
		
		Node nextNode = head.next;
		if(nextNode != null) { //즉 기존 list 길이가 1보다 컸다면
			nextNode.prev = null; //이제 앞에 암것도 없어
		}
		head = nextNode; //네가 맨 앞이야
		size--;
		
		//size==1이었다면 tail이 물고 있을 수도 있으니
		if(size == 0) {
			tail = null; //tail도 관리해주기
		}
		
		return data;
	}
	
	public String remove(int idx) {
		if(idx>= size || idx<0) { //여기는 등호 잇음 유의
			return null; //범위 벗어남
		}
		if(idx == 0) return remove(); //위랑 똑같
		
		Node prevNode = get(idx-1);
//		Node rmNode = prevNode.next; //뭐 이걸로 밑에 갖다 써도 되죠
		Node nextNode = prevNode.next.next; //get(idx-1).next.next는 비추
		//위ㅣ에서 idx>=size 조건은 null 처리했으니까 idx-1해도 범위 안벗어남
		
		String data = prevNode.next.data;
		
		if(nextNode != null) { //뺄 거 뒤에 데이터가 있어
			nextNode.prev = prevNode; //걔를 다음거뒤에연결해줘
			prevNode.next = nextNode; //나는 빠질게...
		} else { //만약에 널이엇으면 어케?
			prevNode.next = null;
			tail = prevNode;
		}
		size--;
		return data;
	}
	
	//출력
	public void printList() {
		Node curr = head;
		if(head == null) {
			System.out.println("공백");
			return;
		}
		while(curr != null) {
			System.out.println(curr.data+" -> ");
			curr = curr.next;
		}
	}
	
}
