package modifier07_object_array;

public class PersonManager {
	int size = 0;
	private Person[] arr = new Person[100];
	
	//싱글턴 2단계: 내부에서 내가 날 만들어버림
	private static PersonManager instance = new PersonManager();
	// 3-2: 근데2? 밑에 3-1에서 static을 붙이면 instance에 줄그어짐 얘도 static 되어야함
	
	//싱글턴 1단계: 외부에서 생성 못 하게 해라
	private PersonManager() {
		
	}
	//이렇게 기본 생성자를 private로 해두면 외부에서 생성 못한다
	
	//싱글턴 3단계: 내가 만든 나를 외부에서 쓸 수 있게 open한다
	//3-1: 근데 밖에다가 부르려면 static 해서 메모리에 올려놔야겟다
	public static PersonManager getInstance() {
		return instance;
	}
	
	public void addPerson(Person p) {
		if(size < arr.length) {	
			arr[size] = p;
			size++;	
		} else {
			System.out.println("자리없음");
		} 
	}
		
}
