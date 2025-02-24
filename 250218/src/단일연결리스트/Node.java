package 단일연결리스트;

//데이터 필드 & 링크 필드(==다음 주소 가리키는)
public class Node {
	//데이터 필드를 여기선 스트링으로 만들긴했지만
	//제네릭으로 선언해서 쓸 수도 있음! <T> <<해보기
	public String data;
	//Node라고 하는 다음 주소를 저장하겠다
	public Node link;
	
	public Node() {} //기본생성자가 없으면 파라미터가 무조건 있어야만 노드를 만들 수 있음
	
	public Node(String data) {
		this.data = data;
		this.link = null; //이 부분은 굳이 안 써도 됨 어차피 참조자료형이라 기본값이 널
	}

}
