package generics01_nomal_box;

class Box { //만능 상자
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box box = new Box(); //아무거나 다 넣을 수 있다.
		box.setObj(1);
		System.out.println(box.getObj());
		
		box.setObj("문자열");
		System.out.println(box.getObj());
		
		if (box.getObj() instanceof Double) {
			System.out.println("실수형 값입니다. "+(Double) box.getObj());
		} else if(box.getObj() instanceof String) {
			System.out.println("문자열이다. " +box.getObj());
		}
	}

}
