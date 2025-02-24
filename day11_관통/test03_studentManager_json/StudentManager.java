package test03_studentManager_json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


//학생의 목록을 관리하는 관리자 (싱글턴 설계)
public class StudentManager {
	// 학생목록 : 배열(고정된 길이), 리스트(동적 길이)
	private List<Student> students = new ArrayList<Student>();
	private static StudentManager manager = new StudentManager();
//	private static StudentManager manager;

	private File file = new File("data/student.json");
	private Gson gson = new Gson();

	private StudentManager() {
//		loadData();
		if (file.exists()) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
				String str = null; // 바구니
				StringBuilder sb = new StringBuilder();
				while ((str = br.readLine()) != null) {
					sb.append(str); // 한줄씩 이어서 붙인다.
				}
				Type studentListType = new TypeToken<ArrayList<Student>>() {
				}.getType();
				students = gson.fromJson(sb.toString(), studentListType);
			} catch (IOException e) {
				System.out.println("이슈발생");
			}
		}

	}

	public static StudentManager getManager() {
//		if(manager == null) {
//			manager = new StudentManager();
//		}
		return manager;
	}

	// 삽입 C
	public void addStudent(Student student) {
		// 배열일때는 크기가 결정되어 있으므로 넘치지 않아야한다는 조건 필요!
		students.add(student);
		// 내가 따로 조건을 걸었다면 잘 했으면 true / false 반환하는 형태로 만들수도 있음
	}

	// 조회 R
	// 1. 전체 목록 조회
	public List<Student> getAllStudent() {
		// 만약! 배열로 했다면....
		// 크기가 100인 전체를 반환하는게 아니라....
		// 실제 크기만큼의 배열을 만들어서 반환을 했다.
		return students;
	}

	// 2. 이름 검색 조회 (동명이인이 있다.... 그런데.. 우리는 없다고 가정!)
	public Student searchByName(String name) {
		for (int i = 0; i < students.size(); i++) {
			Student st = students.get(i);
			if (st.getName().equals(name)) {
				return st;
			}
		}
		/// 아래의 코드가 실행이 된다는 것은...
		return null;
	}

	// 수정 U
	// 전공 변경
	public boolean changeMajor(String name, String major) /* throws StudentNotFoundException */ {
		// 전체 사람 돌면서 찾아야하는데
		for (Student st : students) {
			if (st.getName().equals(name)) {
				st.setMajor(major);
				return true;
			}
		}
		throw new StudentNotFoundException(name);
	}

	// 삭제 D
	public boolean removeStudent(String name) {
		for (int i = students.size() - 1; i >= 0; i--) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				return true;
			}
		}
		return false;
	}

	public void saveData() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));) {
			bw.write(gson.toJson(students));
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
