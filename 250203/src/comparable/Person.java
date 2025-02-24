package comparable;

//직접 클래스 비교 기준을 설정하자
public class Person implements Comparable<Person> {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		//나이를 기준으로 정렬해 보자
		
		if (age == o.age) { //나의 age와 o.의 age가 동일할 때
			return 0; //동일한 경우
		} else if (age > o.age) {//내가 더 크면 
			return 1;
		} else {
			return -1;
		}
		//아님 위의 거 말고 이런 방법도 잇다
//		return age - o.age; //오름차순
//		return o.age - age; //내림차순
//		return Integer.compare(age, o.age); //이런 식으로도 가능
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
	
	
}
