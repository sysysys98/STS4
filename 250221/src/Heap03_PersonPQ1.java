import java.util.PriorityQueue;
//class Person implements Comparable<Person> {
//	String name;
//	int age;
//	
//	public Person() {
//		this("김싸피",13);
//	}
//	
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//
//	@Override
//	public int compareTo(Person o) {
//		//나이순
////		return this.age - o.age;
//		//이름순
//		return this.name.compareTo(name);//문자열은 이렇게 비교해야댐~
//	}
//	
//	
//}//person
public class Heap03_PersonPQ1 {
	
	public static void main(String[] args) {
		PriorityQueue<Person> pq = new PriorityQueue<>();
		
		pq.add(new Person("정봉기",25));
		pq.add(new Person("강건",38));
		pq.add(new Person("김준영",26));
		pq.add(new Person("최시영",16));
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}
}
