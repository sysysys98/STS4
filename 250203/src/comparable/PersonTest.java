package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {
	public static void main(String[] args) {
		List<Person> lst = new ArrayList<>();
		
		lst.add(new Person("김", 2));
		lst.add(new Person("이", 1));
		lst.add(new Person("박", 3));
		
		Collections.sort(lst);
		
		System.out.println(lst);
	}
}
