package test02_gson;

import com.google.gson.Gson;

public class GsonTest02 {
	//gson 추가 방법은 2가지
	//1. add jars
	//2. maven 추가(프젝을 아예 maven으로 열어서 넣기)
	
	public static void main(String[] args) {
		Gson gson = new Gson(); //인스턴스 생성
		
		//자바객체를 JSON데이터(문자열)로 만들기
		
		Student st= new Student("Yang",45,"Computer");
		System.out.println(st);
		
		String stJson = gson.toJson(st);
		System.out.println(stJson);
		
		//json 데이터를 자바 객체로 만들기
		Student st2 = gson.fromJson(stJson, Student.class);
		System.out.println(st2);
		
	}
}
