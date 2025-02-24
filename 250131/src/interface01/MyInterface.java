package interface01;

//public class가 아니라 interface라는 점만 클래스와 다름
public interface MyInterface {	
	
	public abstract void method1(); //이렇게 쓰든
	void method2(); //생략하고 이렇게 쓰든 같다.
	
	int NUMBER = 1; //상수
	public static final int NUMBER2 = 10; //이것도 위아래가 같은 의미다.

}
