package modifier07_object_array;

public class PersonTest {
public static void main(String[] args) {
	Person p1 = new Person("양",45,"유튜브");
	Person p2 = new Person("홍",25,"골프");
	
	PersonManager pm = new PersonManager();
	pm.addPerson(p1);
	pm.addPerson(p2);
	
	//pm이 해고됐다
	PersonManager pm2 = new PersonManager();
	// 새 pm이 왔다
	// 그치만 인수인계가 안 됐다
}
}
