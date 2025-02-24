package test03_studentManager_json;

public class StudentNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public StudentNotFoundException(String name) {
		super(name+" : 없는 사람입니당");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
