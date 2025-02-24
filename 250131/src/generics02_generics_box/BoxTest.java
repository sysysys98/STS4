package generics02_generics_box;

class Box<T> { //타입을 명시한 병
	private T t;

	public T getObj() {
		return t;
	}

	public void setObj(T t) {
		this.t = t;
	}
	
	//제네릭 메서드
	public <A> void printClassName(A item) {
		System.out.println("Item type : "+item.getClass().getName());
	}
}

public class BoxTest {
	public static void main(String[] args) {
		 Box<Integer> box = new Box<>();
		 box.printClassName("Hello");
		 
	}
}
