package test02_gson;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonTest01 {
	//gson 추가 방법은 2가지
	//1. add jars
	//2. maven 추가(프젝을 아예 maven으로 열어서 넣기)
	
	public static void main(String[] args) {
		Gson gson = new Gson(); //인스턴스 생성
		
		//자바객체를 JSON데이터(문자열)로 만들기
		
		Student st1= new Student("Yang",45,"Computer");
		Student st2= new Student("Kim",15,"Math");
		Student st3= new Student("Park",45,"Art");
		
		//객체 배열
		Student[] sArr = new Student[3];
		sArr[0] = st1;
		sArr[1] = st2;
		sArr[2] = st3;
		
		System.out.println(Arrays.toString(sArr));
		
		//배열->json
		String arrStr = gson.toJson(sArr);
		System.out.println(arrStr);
		
		//json->객체배열
		Student[] sArr2 = gson.fromJson(arrStr, Student[].class);
		System.out.println(Arrays.toString(sArr2));
		
		//객체 리스트
		List<Student> sList = new ArrayList<>();
		sList.add(st1);
		sList.add(st2);
		sList.add(st3);
		
		//객체 리스트를 json으로
		String listStr = gson.toJson(sList);
		System.out.println(listStr);
		
		//json -> 객체리스트
		
		java.lang.reflect.Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
		ArrayList<Student> sList2 = gson.fromJson(listStr, studentListType);
		System.out.println(sList2);
	}
}
