package test05_user_exception;

public class FruitNotFoundException extends Exception {

	public FruitNotFoundException(String name) {
		//부모생성자를 호출하는디...
		//문자열을 담아서 부모 생성자를 호출한다
		super(name+"에 해당하는 과일은 없습니다.");
		//Exception은 문자열만 가지고 생성할 수 있는 생성자가 있구만!
	}
	

}
