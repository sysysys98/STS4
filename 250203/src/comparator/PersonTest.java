package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
	public static void main(String[] args) {
		List<Person> lst = new ArrayList<>();
		
		lst.add(new Person("김", 2));
		lst.add(new Person("이", 1));
		lst.add(new Person("박", 3));
		
//		Collections.sort(lst, new PersonComparator());
		//아니면 익명 클래스를 쓰는 1회성 방법
		Collections.sort(lst, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.age-o2.age;
			}
		});
		
		//람다표현식
		Collections.sort(lst, (p1,p2)->Integer.compare(p1.age, p2.age));
		lst.sort((p1, p2)->p1.name.compareTo(p2.name));
		
		System.out.println(lst);
	}
}
