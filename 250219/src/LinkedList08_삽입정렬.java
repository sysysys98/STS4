
public class LinkedList08_삽입정렬 {
	public static void main(String[] args) {
		int[] data = {69, 10, 30, 2, 16, 8, 3, 22};
		
		//삽입 정렬을 할거야
		//1부터 하는 이유는: 이미 [0] 요소는 정렬 집합에 포함되어 있다고 가정하고 시작해서
		for(int i=1; i<data.length; i++) {
			int j; //정렬 포인트
			int key = data[i]; //내가 이번에 정렬하고자 하는 수
			//첫번째 key=10이 되고 j라는 포인트를 갖고 정렬을 시작한다
			
			for(j=i-1; j>=0 && key<data[j]; j--) {
				data[j+1] = data[j]; //69를 10으로 덮어버림(key는 어차피 저장해놧으니까)
			}//뒤로 밀착
			
			data[j+1] = key; //위의 for문에서 j--가 되는 바람에 j가 지금 -1된 상태임
		}
	}
}
