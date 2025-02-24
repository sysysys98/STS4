//최대힙

import java.util.Arrays;

public class Heap01_Array구현 {
	static int[] heap;
	static int heapSize;
	
	public static void main(String[] args) {
		//문제
		
		heap = new int[100]; //사이즈는 문제 입력을 보고 판단해서 결정
		heapSize = 0; //머 어차피 +1하면서 0은 버릴겁니다
		
		System.out.println(Arrays.toString(heap));
		heapPush(10);
		System.out.println(Arrays.toString(heap));
		heapPush(25);
		System.out.println(Arrays.toString(heap));
		heapPush(15);
		System.out.println(Arrays.toString(heap));
		heapPush(19);
		System.out.println(Arrays.toString(heap));
	}
	
	
	//삽입 / 힙 자료형에 맞게 item이 들어온다
	public static void heapPush(int item) {
		heap[++heapSize] = item; //사이즈 하나 키우고 거기다 값을 넣는다
		
		int ch = heapSize;
		int p = ch/2; //버림 연산이지만 정수형이라 어차피 버려짐
		
		//올릴 수 있으면 올라가
		while(p>0 && heap[p] < heap[ch]) { //p인덱스가 0이 되거나 자식이 커지면 멈춰!!
			//스왑
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			ch = p;
			p = ch/2; //갱신
		}
	}
	
	public static int heapPop() {
		
		if(heapSize == 0) { //든게업엉
			return -1;
		}
		
		int item = heap[1];
		
		heap[1] = heap[heapSize--];
		int p = 1;
		int ch = p*2; //왼자 세팅
		if(ch+1 <= heapSize && heap[ch] < heap[ch+1]) { //오자가 있다면 비교
			ch+=1;//오자로 교환
		}
		
		//내려갈 수 있으면 내려가
		while(ch<= heapSize && heap[p] < heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch]= tmp;
			
			p=ch;
			ch=p*2; //왼자 세팅
			if(ch+1 <= heapSize && heap[ch] < heap[ch+1]) { //오자가 있다면 비교
				ch+=1;//오자로 교환
			}
			
		}
		
		return item;
		
	}
}
