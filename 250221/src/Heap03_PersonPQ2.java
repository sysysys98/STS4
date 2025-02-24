import java.util.PriorityQueue;

//얘와 쟤의 비교
class Person {
	String name;
	int age;
	
	public Person() {
		this("김싸피",13);
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
}//person
public class Heap03_PersonPQ2 {
	
	public static void main(String[] args) {
//		PriorityQueue<Person> pq = new PriorityQueue<>(
//				new NameComparator()
//				);
//		PriorityQueue<Person> pq = new PriorityQueue<>(
//				new AgeComparator()
//				);
		//익명 클래스 방식
		PriorityQueue<Person> pq = new PriorityQueue<>(new Comparator<Person> (){
					@Override
					public int compare(Person o1, Person o2) { 
						return o2.age - o1.age;
					});
		
		pq.add(new Person("정봉기",25));
		pq.add(new Person("강건",38));
		pq.add(new Person("김준영",26));
		pq.add(new Person("최시영",16));
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	
}
}
}