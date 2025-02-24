package generics03_generics_method;

class Box<T> { //타입을 명시한 병
	private T t;

	public T getObj() {
		return t;
	}

	public void setObj(T t) {
		this.t = t;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		 Box<Integer> intBox = new Box<>(); //정수 박스
		 
//		 Box<int> intBox = new Box<int>();
		 //이렇게 기초자료형을 직접 쓸 수는 없음
		 //참조자료형만 쓸 수 있음
		 //Wrapper 클래스를 쓰든가
		 //int -> Integer, char -> Character, boolean -> Boolean
	}
}
