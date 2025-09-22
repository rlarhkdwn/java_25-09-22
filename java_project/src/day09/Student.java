package day09;

import java.util.Arrays;

public class Student { 
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
	
	// 수강과목 추가 : 메서드가 1번 호출될때마다 1개의 수강과목/기간 이 추가
	
	// 1. 멤버변수 / 2. 생성자 / 3. getter/setter / 4. 필요한 메서드...
	private String name;
	private String birth;
	private String phone;
	private int age;
	
	//회사명 / 브랜드 / 로고 => 변하지 않는 값 (상수) final => 대문자
	private final String COMPANY = "KOREAIT";
	private String branch;
	
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; //수강기간
	// 맴버변수에 배열이 존재한다면 index변수를 사용하는 것이 편리함.
	private int cnt;
	 
	//생성자 (오버로딩)
	public Student() {} //기본생성자
	// 전화만 한학생 / 과목을 설정한학생
	public Student(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public Student(String name, String phone, String branch) {
		// 생성자 호출
		this(name, phone);
		this.branch = branch;
	}
	
	public Student(String name, String birth, String phone, 
			int age, String branch ) {
		//생성자 호출
		this(name, phone, branch);
		this.birth = birth;
		this.age = age;
	}
	
	// 출력메서드
	public void printInfo() {
		// 학생의 기본정보 출력 메서드
		System.out.println("--학생정보--");
		System.out.println("이름:"+name+"("+age+"세 / "+birth+") "+ phone);
	}
	public void printCompany() {
		System.out.println(COMPANY+"("+branch+")");
	}
	public void printCourse() {
		//수강과목이 없다면 => 수강과목이 없습니다.
		if(cnt == 0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		//cnt가 있다면 cnt까지만 출력 => 등록되지 않은 null값은 출력X
		for(int i=0; i<cnt;  i++) {
			System.out.println(course[i]+"["+period[i]+"]");
		}
	}
	
	// 수강과목+기간 추가 메서드
	// main 에서 받은 과목과 기간을 매개변수로 받아 배열에 저장하는 메서드
	// 매개변수 : String course, String period
	public void insertCourse(String course, String period) {
		//배열이 다 차면 배열을 증가
		// cnt == 0
		if(cnt == this.course.length) {
			//배열복사
			String courseTmp[] = new String[this.course.length+5];
			String periodTmp[] = new String[this.period.length+5];
			
			// arraycopy
			System.arraycopy(this.course, 0, courseTmp, 0, this.course.length);
			System.arraycopy(this.period, 0, periodTmp, 0, this.period.length);
			
			// 기존 배열의 참조변수에 객체를 바꿔치기(덮어쓰기)
			this.course = courseTmp;
			this.period = periodTmp;
			
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public String getCOMPANY() {
		return COMPANY;
	}
	public int getCnt() {
		return cnt;
	}
	
	// 내부확인용
	@Override
	public String toString() {
		return "Student [name=" + name + ", birth=" + birth + ", phone=" + phone + ", age=" + age + ", COMPANY="
				+ COMPANY + ", branch=" + branch + ", course=" + Arrays.toString(course) + ", period="
				+ Arrays.toString(period) + ", cnt=" + cnt + "]";
	}
	
}




//package day09;
//
//import java.util.Arrays;
//
//public class Student {
//
//	// 학생 정보를 관리하기 위한 클래스 생성
//	// 학생 기본정보 : 이름, 전화번호, 생년월일, 나이
//	// 학원 정보 : 학원명="KOREAIT", 지점="강남"
//	// 수강 과목 : 수강과목, 기간
//	// 		=> 수강과목은 여러과목을 들을 수 있음.[5] / 기간[5]
//	//
//	// ex) 홍길동 010-1111-1111, 010101, 25
//	// 		KOREAIT, 강남
//	// 		java, 		2025-08-01~2025-08-30
//	// 		웹개발국비,	2025-08-26~2025-02-14
//	//		DBMS, 		2025-09-15~2025-10-15
//	// 수강과목 추가: 메서드가 1번 호출될때마다 1개의 수강과목/기간 추가
//	// 수강과목 삭제: 메서드가 1번 호출될 때마다 선택한 수강과목 삭제
//	//
//	// 기본 Student[5] 더 추가되면 배열 복사
//	private String name;
//	private String phone;
//	private String birth;
//	private String age;
//	private final String ACADEMY = "KOREAIT";;
//	private String branch;
//	private int courseCount;
//	private String[] course;
//	private String[] startDate;
//	private String[] endDate;
//	
//	// 생성자
//	public Student() {
//		this.course = new String[5];
//		this.startDate = new String[5];
//		this.endDate = new String[5];
//	}
//	
//	
//	// 수강과목 추가
//	public void addCourse(String course, String startDate, String endDate) {
//		if (this.courseCount >= this.course.length) {
//			this.course = extendArray(this.course);
//			this.startDate = extendArray(this.startDate);
//			this.endDate = extendArray(this.endDate);
//		}
//		this.course[this.courseCount] = course;
//		this.startDate[this.courseCount] = startDate;
//		this.endDate[this.courseCount] = endDate;
//		this.courseCount++;
//	}
//	
//	
//	// 수강과목 삭제
//	public void delCourse(String course) {
//		int idx = searchCourse(course);
//		if (idx == -1) {
//			System.out.println("해당 과목이 없습니다.");
//			return;
//		}
//		removeAt(this.course, idx);
//		removeAt(this.startDate, idx);
//		removeAt(this.endDate, idx);
//		this.courseCount--;
//		System.out.println("삭제되었습니다.");
//	}
//	
//	// 수강과목 검색
//	public int searchCourse(String course) {
//		for (int i = 0; i < this.courseCount; i++) {
//			if (this.course[i].equals(course)) {
//				return i;
//			}
//		}
//		return -1; // 없으면 -1
//	}
//	
//	
//	// 배열 복사
//	private String[] extendArray(String[] arr) {
//		String[] newArr = new String[arr.length + 5];
//		System.arraycopy(arr, 0, newArr, 0, arr.length);
//		return newArr;
//	}
//	
//	// 배열 요소 삭제
//	private void removeAt(String[] arr, int idx) {
//		for (int i = idx; i < this.courseCount; i++) {
//			arr[i] = arr[i+1];
//		}
//	}
//	
//	// print
//	public void print() {
//		System.out.printf("이름: %s, 전화번호: %s, 생년월일: %s, 나이: %s, 학원정보: %s %s지점\n", name, phone, birth, age, ACADEMY, branch);
//		System.out.print("수강 과목\t\t\t시작일\t\t\t종료일\n");
//		if (this.courseCount <= 0) {
//			System.out.println("수강과목이 없습니다.");
//		}
//		else {
//			for (int i = 0; i < courseCount; i++) {
//				System.out.printf("%s\t\t\t%s\t\t\t%s\n", course[i], startDate[i], endDate[i]);
//			}
//			System.out.println();	
//		}
//	}
//	
//	
//	// getter /setter
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getBirth() {
//		return birth;
//	}
//	public void setBirth(String birth) {
//		this.birth = birth;
//	}
//	public String getAge() {
//		return age;
//	}
//	public void setAge(String age) {
//		this.age = age;
//	}
//	public String getAcademy() {
//		return ACADEMY;
//	}
//	public String getBranch() {
//		return branch;
//	}
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
//	public int getCourseCount() {
//		return courseCount;
//	}
//	public void setCourseCount(int courseCount) {
//		this.courseCount = courseCount;
//	}
//	public String[] getCourse() {
//		return course;
//	}
//	public void setCourse(String[] course) {
//		this.course = course;
//	}
//	public String[] getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(String[] startDate) {
//		this.startDate = startDate;
//	}
//	public String[] getEndDate() {
//		return endDate;
//	}
//	public void setEndDate(String[] endDate) {
//		this.endDate = endDate;
//	}
//	
//	// toString
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", phone=" + phone + ", birth=" + birth + ", age=" + age + ", academy="
//				+ ACADEMY + ", branch=" + branch + ", course=" + Arrays.toString(course) + ", startDate="
//				+ Arrays.toString(startDate) + ", endDate=" + Arrays.toString(endDate) + "]";
//	}
//}