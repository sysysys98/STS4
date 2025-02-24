package test03_studentManager_json;

public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String name;

	public StudentNotFoundException(String name) {
		super(name + " : 그런 사람은 없어요!");
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
