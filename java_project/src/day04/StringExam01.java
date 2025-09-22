package day04;

public class StringExam01 {

	public static void main(String[] args) {
		// 주민등록번홀르 참고하여 생년월일과 성별, 나이를 출력
		
		String regNum1 = "990101-1234567"; // 1900년대생 => 1: 남자, 2: 여자
		String regNum2 = "000101-3456789"; // 2000년대생 => 3: 남자, 4: 여자
		int today = 2025;
		
		String[] regNums = new String[2];
		regNums[0] = regNum1;
		regNums[1] = regNum2;
		
		String[] genders = new String[2];
		genders[0] = "여자";
		genders[1] = "남자";
		
		for (int i = 0; i < regNums.length; i++) {
			char gender = regNums[i].charAt(7);
			String year = gender == '1' || gender == '2' ? "19" + regNums[i].substring(0, 2) : "20" + regNums[i].substring(0, 2);
			String month = regNums[i].substring(2, 4).charAt(0) == '0' ? regNums[i].substring(3, 4) : regNums[i].substring(2, 4);
			String day= regNums[i].substring(4).charAt(0) == '0' ? regNums[i].substring(5, 6) : regNums[i].substring(4, 6);
			int age = today - Integer.parseInt(year) + 1;
			
			System.out.printf("주민%d => 생년월일: %s년 %s월 %s일, 성별: %s, 나이: %d\n", i + 1, year, month, day, genders[(int)gender % 2], age);
		}
	}
}