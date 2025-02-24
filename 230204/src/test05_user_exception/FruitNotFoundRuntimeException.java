package test05_user_exception;

public class FruitNotFoundRuntimeException extends RuntimeException {
	public FruitNotFoundRuntimeException(String string) {
		System.out.println("그런 거 없음");
	}

}
