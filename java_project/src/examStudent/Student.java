package examStudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private static int studentCount = 0;
	private int studentCode;
	private String name;
	private String age;
	private String phone;
	private String address;
	private List<Subject> subjectList = new ArrayList<>();
	
	
	public Student(String name, String age, String phone, String address) {
		this.studentCode = studentCount++;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	
	public boolean insertSubject(Subject s) {
		for (int i = 0; i < subjectList.size(); i++) {
			if (subjectList.get(i).getSubjectCode() == s.getSubjectCode()) {
				System.out.println("이미 수강중인 과목입니다.");
				return false;
			}
		}		
		subjectList.add(s);
		System.out.println("등록되었습니다.");
		return true;
	}
	
	public boolean deleteSubject(int subjectCode) {
		for (int i = 0; i < subjectList.size(); i++) {
			if (subjectList.get(i).getSubjectCode() == subjectCode){
				subjectList.remove(i);
				System.out.println("삭제되었습니다.");
				return true;
			}
		}
		System.out.println("해당 과목이 없습니다.");
		return false;
	}
	
	public void printSubjectList() {
		System.out.println("=====수강 과목=====");
		if (!subjectList.isEmpty()) {
			for (int i = 0; i < subjectList.size(); i++) {
				System.out.print(i + 1 + ". ");
				subjectList.get(i).print();
			}
		}
		else {
			System.out.println("수강중인 과목이 없습니다.");
		}
	}
	
	public void printStudent() {
		System.out.printf("학번: %d, 이름: %s, 나이: %s, 전화번호: %s, 주소: %s\n", studentCode, name, age, phone, address);
	}
		
	public static int getStudentCount() {
		return studentCount;
	}
	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}
	public int getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
}