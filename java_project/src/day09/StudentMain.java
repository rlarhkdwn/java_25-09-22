package day09;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		// 학생정보를 관리하기 위한 클래스 생성
		// 학생 기본정보: 이름, 전화번호, 생년월일, 나이
		// 학원 정보: 학원명="KOREAIT", 지점
		// 수강 과목: 수강과목, 기간
		// 		=> 수강과목은 여러과목을 들을 수 있음.[5] / 기간[5]
		
		/* ex) 홍길동,  010-1111-1111, 010101, 25
		 *     KOREAIT, 강남
		 *     java,		2025-08-01~2025-08-30
		 *     웹개발국비, 	2025-08-26~2026-02-14
		 *     DB, 			2025-09-15~2025-10-15
		 * */
		
		// 기본 Student[5] 더 추가되면 배열복사 
		Scanner scan = new Scanner(System.in);
		
		// 등록된 학생 배열
		Student[] std = new Student[5];
				
		String[] gigum = {"강남","신촌","인천","대전","수원"};
		String[] subjectName = {"java","DB","javaScript","python","C","웹국기"};
		String[] subjectDate = {"2025-08-01~2025-08-30","2025-09-15~2025-10-15","2025-07-01~2025-07-31","2025-10-01~2025-10-31",
				"2025-09-01~2025-09-31","2025-08-26~2026-02-14"};
		
//		System.out.println("학생명 >");
//		String name = scan.next();
//		System.out.println("전화번호 >");
//		String phone = scan.next();
		String name = "hong";
		String phone = "010-1111-2222";
		Student s = new Student(name, phone);
		
//		System.out.println("--지점선택--");
//		int gIdx = 0;
//		for(String g : gigum) {
//			gIdx++;
//			System.out.print(gIdx+"."+g+"  ");
//		}
//		System.out.println();
//		System.out.println("지점 > ");
//		int gigumIdx = scan.nextInt();
		int gigumIdx = 1;
		s.setBranch(gigum[gigumIdx-1]);
		
//		System.out.println();
//		System.out.println("--과목 선택--");
//		for(int i=0; i<subjectName.length; i++) {
//			System.out.println((i+1)+"."+subjectName[i]+" / "+subjectDate[i]);
//		}
//		System.out.println();
//		System.out.println("과목 >");
//		int subjectIdx = scan.nextInt();

		int subjectIdx = 2;
		s.insertCourse(subjectName[subjectIdx-1], subjectDate[subjectIdx-1]);
		
		std[0] = s;
//		std[0].printInfo();
//		std[0].printCompany();
//		std[0].printCourse();
		
		std[1] =new Student("kim", "010101", "010-2222-2222", 25, "신촌");
		std[1].insertCourse(subjectName[1], subjectDate[1]);
		std[1].insertCourse(subjectName[0], subjectDate[0]);
		std[1].insertCourse(subjectName[5], subjectDate[5]);
		
		std[2] =new Student("lee", "010103", "010-3333-2222", 25, "강남");
		std[2].insertCourse(subjectName[3], subjectDate[3]);
		std[2].insertCourse(subjectName[0], subjectDate[0]);
		std[2].insertCourse(subjectName[5], subjectDate[5]);
		
		std[3] =new Student("pack", "030801", "010-2222-5555", 22, "인천");
		std[3].insertCourse(subjectName[4], subjectDate[4]);
		std[3].insertCourse(subjectName[5], subjectDate[5]);
		
		std[4] =new Student("choi", "020901", "010-9999-2222", 23, "신촌");
		
//		System.out.println("----전체 학생 정보----");
//		//학생정보와 지점 정보만 출력
//		for(Student tmp : std) {
//			tmp.printInfo();
//			tmp.printCompany();
//			tmp.printCourse();
//		}
		
//		String searchBranch = "강남";
//		//강남 지점 학생 명단 출력
//		for (Student st : std) {
//			if (st != null && st.getBranch().equals(searchBranch)) {
//				st.printInfo();
//				st.printCompany();
//				st.printCourse();
//			}
//		}
//		
//		System.out.println("================");
//		
//		String searchCourse = "java";
//		// java를 수강하고 있는 학생 명단
//		for (Student st : std) {
//			for (String c : st.getCourse()) {
//				if (c != null && c.equals(searchCourse)) {
//					st.printInfo();
//					st.printCompany();
//					st.printCourse();
//					break;
//				}
//			}
//		}
		
		// 학생 이름을 입력받아 입력받은 학생의 정보를 출력
		System.out.print("검색할 학색의 이름을 입력하세요 => ");
		String searchName = scan.nextLine();
		for (Student st : std) {
			if (st != null && st.getName().equals(searchName)) {
				st.printInfo();
				st.printCompany();
				st.printCourse();
			}
		}
		
		
		
		
//		System.out.println("사용자가 선택한 지점");
//		System.out.println(gigum[gigumIdx-1]);
//		System.out.println("사용자가 선택한 과목");
//		System.out.println(subjectName[subjectIdx-1]+
//				" / "+subjectDate[subjectIdx-1]);
		
		
		
		scan.close();

	}

}



//package day09;
//
//import java.util.Scanner;
//
//public class StudentMain {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		StudentMain sm = new StudentMain();
//		Student[] students = new Student[100];
//		int studentCount = 0;
//		
//		
//		
//		
//		
//		while(true) {
//			sm.menu();
//			System.out.print("입력 => ");
//			String choice = scan.nextLine();
//			
//			switch (choice) {
//			case "1":
//				System.out.println("=====학생정보 보기=====");
//				if (studentCount <= 0) {
//					System.out.println("등록된 학생이 없습니다.");
//				}
//				for (int i = 0; i < studentCount; i++) {
//					System.out.println(i + 1);
//					students[i].print();
//				} 
//				break;
//			
//			case "2":
//				System.out.println("=====학생정보 추가=====");
//				Student s = new Student();
//				
//				System.out.print("이름: ");
//				String name = scan.nextLine();
//				s.setName(name);
//				
//				System.out.print("전화번호(010-xxxx-xxxx): ");
//				String phone = scan.nextLine();
//				s.setPhone(phone);
//
//				System.out.print("생년월일(6자리): ");
//				String birth = scan.nextLine();
//				s.setBirth(birth);
//				
//				System.out.print("나이: ");
//				String age = scan.nextLine();
//				s.setAge(age);
//				
//				System.out.print("지점(강남, 신촌, 인천): ");
//				String branch = scan.nextLine();
//				s.setBranch(branch);
//				
//				if (studentCount >= students.length) {
//					students = sm.extendArray(students);
//				}
//				students[studentCount++] = s;
//				break;
//				
//			case "3":
//				System.out.println("=====학생정보 삭제=====");
//				if (studentCount <= 0) {
//					System.out.println("등록된 학생이 없습니다.");
//				}
//				else {
//					System.out.println("학생수: " + studentCount);
//					System.out.print("삭제할 학생 번호 입력 => ");
//					int num = scan.nextInt();
//					scan.nextLine();
//					
//					if (num < 1 || num > studentCount) {
//						System.out.println("해당 번호가 없습니다.");
//					}
//					else {
//						sm.removeAt(students, num - 1);
//						studentCount--;
//						System.out.println(num + "번 학생이 삭제되었습니다.");
//					}
//				}
//				break;
//				
//			case "4":
//				System.out.println("=====수강과목 추가=====");
//				System.out.print("학생번호를 입력해주세요 => ");
//				int num = scan.nextInt();
//				scan.nextLine();
//				
//				if (num < 1 || num > studentCount) {
//					System.out.println("해당 번호가 없습니다.");
//				}
//				else {
//					System.out.print("과목명: ");
//					String course = scan.nextLine();
//					System.out.print("시작일(00.00.00): ");
//					String startDate = scan.nextLine();
//					System.out.print("종료일(00.00.00): ");
//					String endDate = scan.nextLine();
//					students[num - 1].addCourse(course, startDate, endDate);
//					System.out.println("과목이 추가되었습니다.");
//				}
//				break;
//				
//			case "5":
//				System.out.println("=====수강과목 삭제=====");
//				System.out.print("학생번호를 입력해주세요 => ");
//				num = scan.nextInt();
//				scan.nextLine();
//				
//				if (num < 1 || num > studentCount) {
//					System.out.println("해당 번호가 없습니다.");
//				}
//				else {
//					System.out.print("삭제할 과목을 입력해주세요 => ");
//					String course = scan.nextLine(); 
//					students[num - 1].delCourse(course);
//				}
//				break;
//				
//			case "6":
//				System.out.println("프로그램 종료");
//				scan.close();
//				return;
//				
//			default:
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}
//	}
//	
//	public void menu() {
//		System.out.println("=====학생관리 프로그램=====");
//		System.out.println("1. 학생정보 보기");
//		System.out.println("2. 학생정보 추가");
//		System.out.println("3. 학생정보 삭제");
//		System.out.println("4. 수강과목 추가");
//		System.out.println("5. 수강과목 삭제");
//		System.out.println("6. 프로그램 종료");
//	}
//	
//	private Student[] extendArray(Student[] arr) {
//		Student[] newArr = new Student[arr.length + 20];
//		System.arraycopy(arr, 0, newArr, 0, arr.length);
//		return newArr;
//	}
//
//	
//	private void removeAt(Student[] arr, int idx) {
//		for (int i = idx; i < arr.length - 1; i++) {
//			arr[i] = arr[i+1];
//		}
//	}
//}
