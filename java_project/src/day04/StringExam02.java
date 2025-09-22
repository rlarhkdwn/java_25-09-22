package day04;

public class StringExam02 {

	public static void main(String[] args) {
		// fileName.suffix
		// 파일명과 확장자를 분리하여 출력
		// 확장자가 "java"면 자바파일입니다. / 기타파일입니다.
		String file = "자바의정석.java";
		int idx = file.lastIndexOf(".");
		String name = file.substring(0, idx);
		String extension = file.substring(idx + 1);
		System.out.printf("%s은 %s파일입니다.", name, extension.equals("java") ? "자바" : "기타");
	}
}
// 자바의정석은 자바파일입니다.