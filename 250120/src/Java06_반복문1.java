
public class Java06_반복문1 {
	public static void main(String[] args) {
		//for 문
		for (int i=0; i<6; i++) { //증감식의 i++, ++i는 무관함 결과 똑같음 문장이 진행되고 증감식이 작동하므로
			System.out.println(i);
		}
		
		//while 문
		int i = 0;
		while(i<5) {
			System.out.println(i++);
		} //while문 한개로도 구구단 가능함
	}
}
