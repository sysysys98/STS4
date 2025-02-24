package modifier01_static;

public class Person {
	
	//클래스 변수: 모든 클래스가 공유하는 값
	static int pCnt = 1;
	
	// 인스턴스 변수(생성되는 인.턴마다 고유한 값을 가지게 됨)
	String name;
	int age;
	String hobby;
	
	//static 블록(초기화 블록): 클래스가 로드되면 한 번 돌아간다
	static {
		//클래스 변수를 초기화 하기도 하지만
		//안에서 특정한 작업을 하고 싶으면 그런 내용을 넣어줄 수도 있음
		pCnt = 1000;
		System.out.println("스태틱돌아감");
	}
	
	//정적 메서드 <= 미리 메모리에 올라가 있다
	public static void eat() {
		pCnt = 100; //가능
		//name = "Yang"; //이건 안 된다(static이 아니라 인스턴스 변수라서)
	}
	
	//인스턴스 메서드 <= 내가 인스턴스를 new 해야만 쓸 수 있는 메서드
	public void study() {
		pCnt = 1000;
		name = "Yang"; //인스턴스 메서드가 불러진다는 건 이미 인스턴스 변수가 있다는 거니까 얘는 문제x		
	}
}
