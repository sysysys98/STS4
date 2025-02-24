package test03_studentManager_json;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import test02_gson.Student;

//학생 목록의 관리자(싱글턴 설계)
public class StudentManager {
	//학생 목록
	private List<Student> students = new ArrayList<>();
	private static StudentManager sm = new StudentManager();
	//밑에서 sm을 static으로 반환하니까 얘도 static이어야 오류가 안 남
	
	private File file = new File("data/student.json");
	private Gson gson = new Gson();
	
	private StudentManager() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
			String str = null; //바구니
			StringBuilder sb = new StringBuilder();
			while((str = br.readLine()) != null){
				sb.append(str); //한줄씩 이어서 붙인다.
			}
			Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
			students = gson.fromJson(sb.toString(), studentListType);
		} catch(IOException e) {
			System.out.println("이슈 발생");
			e.printStackTrace();
		}
		
	}
	
	public static StudentManager getManager() { //외부 접근을 위해 static
		return sm;
	}
	
	//삽입 Create
	public void addStudent(Student st) {
		//배열일 땐 크기가 결정되어 있으므로 넘치지 않아야 한다는 조건 필요햇음
		//근데 list니깐 굳이? 지금은 필요 ㄴㄴ
		students.add(st);
		
		//limit 조건 걸거면 boolean 반환하는 형태로 만들수도 잇음
	}
	
	//조회 Read
	//1. 전체 목록 조회
	//걍 뭐 students에 대한 getter인 거죠
	public List<Student> getAllStudent(){
		return students;
		//만일 배열로 했다면 실제 크기가 100인 전체 배열 반환이 아니라
		//실제 크기 만큼의 배열을 만들어서 반환을 했을 것임(그러나 list라 필요없음)
	}
	
	//2. 이름 검색 조회(동명이인 없다고 가정)
	public Student searchByName(String name) {
		int size = students.size();
		for (int i=0; i<size; i++) {
			Student st = students.get(i);
			if(st.getName().equals(name)) {
				return st;
			}
		}
		//위에서 return이 안됐으면 맞는 이름이 없음
		return null;
	}
	
	//수정 Update
	//전공 변경
	public boolean changeMajor(String name, String major) {
		//만일 바꿀 정보가 많으면 필드를 파라미터로 주기보다 객체 자체를 주는 게 나을 수도 있음
		for (Student st : students) {
			if (st.getName().equals(name)) {
				st.setMajor(major);
				return true;
			}
		}
		throw new StudentNotFoundException(name);
	}
	
	//삭제 Delete
	public boolean removeStudent(String name) {
		//리스트 내용을 삭제할 땐 뒤에서부터 삭제하면 좋음
		//하나 삭제되면 idx가 땡겨지면서 오차가 발생해 지워지지 않는 경우가 생길 수 있음
		for (int i=students.size()-1; i>=0; i--) {
			if(students.get(i).getName().equals(name)) {
				students.remove(i);
				return true; //만일 동명이인 있으면 다 지워질 때까지 return하면 안되겟징
			}
		}
		
		return false;
	}
	
	public void saveDate() {
		//메인스트림1개에 보조스트림2개
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))){
			bw.write(gson.toJson(students));
		} catch (FileNotFoundException e) {
			
		}
	}

}
