package examStudent;

import java.util.Scanner;

public interface studentProgram { // StudentController 구현
//	1. 학생 등록(메서드)
//	2. 학생 리스트 출력
//	3. 학생 검색(학생정보, 수강정보)
//	4. 수강신청(한 학생에 대한)
//	5. 수강철회(한 학생에 대한)
	
	void insertStudent(Scanner scan);
	
	void printStudent();
	
	Student searchStudent(Scanner scan, StudentMain sm); // int studentNum
	
	void insertSubject(Scanner scan, StudentMain sm); // int subjectNum
	
	void deleteSubject(Scanner scan, StudentMain sm); // int subjectNum
	
}