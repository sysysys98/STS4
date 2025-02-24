
public class Tree01_순회 {
	public static char[] tree = new char[] {' ','A','B','C','D','E','F','G',' ',' ','H','I'};
	public static int n = tree.length;
	public static void main(String[] args) { //참고로 char의 기본값은 \u0000
		System.out.println("전위 순회 : ");
		preOrder(1);
		System.out.println();
		System.out.println("중위 순회 : ");
		inOrder(1);
		System.out.println();
		System.out.println("후위 순회 : ");
		postOrder(1);
		System.out.println();
		
		
	}
	
	//전위 순회 (v는 노드 번호)
	public static void preOrder(int v) {
		//v라는 노드의 번호가 유효한지 확인
		if(v < n) { //범위 안에 있으니
			//방문 처리
			if(tree[v] != ' ') //널문자 체크도 해주면 좋음~
				System.out.print(tree[v]);
			//왼쪽 자식  탐방
			preOrder(v*2);
			//오른쪽 자식 탐방
			preOrder(v*2+1);
		}
	}
	
	//중위 순회
	public static void inOrder(int v) {
		//v라는 노드의 번호가 유효한지 확인
		if(v < n) { //범위 안에 있으니
			//왼쪽 자식 ㄱㄱ
			inOrder(v*2);
			//방문 처리
			if(tree[v] != ' ') //널문자 체크도 해주면 좋음~
				System.out.print(tree[v]);
			//오른쪽 자식 탐방
			inOrder(v*2+1);
		}
	}
	
	//후위 순회
	public static void postOrder(int v) {
		//v라는 노드의 번호가 유효한지 확인
		if(v < n) { //범위 안에 있으니
			//왼쪽 자식 ㄱㄱ
			postOrder(v*2);
			//오른쪽 자식 탐방
			postOrder(v*2+1);
			//방문 처리
			if(tree[v] != ' ') //널문자 체크도 해주면 좋음~
				System.out.print(tree[v]);			
		}
	}

}
