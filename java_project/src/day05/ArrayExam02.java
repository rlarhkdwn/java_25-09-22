package day05;

public class ArrayExam02 {

	public static void main(String[] args) {
		// 그림파일만 출력, 확장자가 jpg, png
		
		String[] fileName = {
				"이것이.자바다.java", "java의 정석.java", "Arrayjpg.txt",
				"array.java", "String.Png", "StringMethod.jpg",
				"Array.Method.java", "method.png", "java.Method.jpg"
		};
		
		int searchCnt = 0;
		for (String s : fileName) {
			String extension = s.substring(s.lastIndexOf(".") + 1).toLowerCase();
			if (extension.equals("png") || extension.equals("jpg")) {
				System.out.println(s);
				searchCnt++;
			}
		}
		
		if (searchCnt == 0) {
			System.out.println("그림파일이 없습니다.");
		}
	}
}