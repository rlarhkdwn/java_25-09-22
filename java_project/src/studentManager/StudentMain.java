package studentManager;

import java.util.Scanner;

//수강관리 프로그램 - package(studentManager)
//학생 + 수강
//학생 클래스 (Student)
//멤버변수 : 학번, 이름, 나이, 전화번호, 주소, 수강과목(subject[5] class)
//수강과목을 추가하는 메서드
//수강과목을 취소하는 메서드
//수강배열을 출력하는 메서드
//학생정보를 출력하는 메서드
//
//
//수강 클래스(Subject)
//멤버변수 : 과목코드, 과목명, 기간, 시수, 강사명, 강의장...
//하나의 수강 클래스를 출력하는 메서드
//
//
//컨트롤 할 수 있는 클래스(StudentController)
//멤버변수 : Student[5], studentCount 
//인터페이스를 구현
//
//
//main class
//interface 규격화
//==메뉴==
//1. 학생 등록(메서드)
//2. 학생 리스트 출력
//3. 학생 검색(학생정보, 수강정보)
//4. 수강신청(한 학생에 대한)
//5. 수강철회(한 학생에 대한)
//6. 종료

public class StudentMain {
	Subject[] subjectList = new Subject[5];
	int subjectCount = 5;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StudentMain sm = new StudentMain();
		StudentController sc = new StudentController();
		
		// Subject(String name, String period, String hour, String instructor, String room)
		sm.subjectList[0] = new Subject("Java", "2025-09-09~2025-10-08", "3", "김길동", "A");
		sm.subjectList[1] = new Subject("Python", "2025-09-16~2025-10-15", "4", "이길동", "B");
		sm.subjectList[2] = new Subject("C", "2025-10-01~2025-10-31", "3", "박길동", "C");
		sm.subjectList[3] = new Subject("C++", "2025-11-20~2025-12-19", "6", "최길동", "D");
		sm.subjectList[4] = new Subject("DBMS", "2025-12-10~2026-01-09", "5", "홍길동", "E");
		
		String menu;
		
		while (true) {
			// 컨트롤러에 메서드 추가하기
			// 리턴 : int, 매개변수 : Scanner
			
			menu = sc.menuPrint(scan, sm);
			
			switch (menu) {
			case "1": sc.insertStudent(scan); break;
			case "2": sc.printStudent(); break;
			case "3": sc.searchStudent(scan, sm); break;
			case "4": sc.insertSubject(scan, sm); break;
			case "5": sc.deleteSubject(scan, sm); break;
			case "6": System.out.println("종료"); scan.close(); return;
			default: System.out.println("잘못된 메뉴입니다.");
			}
		}
	}
	
	public boolean allDisit(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}