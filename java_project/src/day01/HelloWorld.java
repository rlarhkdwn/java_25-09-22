package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// class는 package 안에 있어야 함
		// class는 대문자로 시작(공백 안됨)
		// 만약 class 명에 여러 단어를 쓰고 싶다면 카멜 케이스로 사용
		// HelloWorld
		// 대소문자 구분 HelloWorld helloworld
		// 주석 : 프로그램으로 읽히지 않는 라인 // <= 한줄 주석, 
		/*
		 * 여러줄 주석
		 * ctrl + / : 주석 단축키
		 * println(); : 줄바꿈 있는 출력
		 * print(); : 줄바꿈 없는 출력
		 * printf(); : 포멧형 출력
		 * */
		
		System.out.println("Hello JAVA!!"); // 기본 출력
		System.out.print("Hello JAVA world!!");
		System.out.print("Test01");
		// 줄바꿈만
		System.out.println();
		// System.out.print(); 는 아무것도 출력하지 않으면 에러
		
		// printf() : %d(정수) %s(문자열) %c(문자) %f(실수형) \n(줄바꿈) \t(tab)
		System.out.printf("%s\n", "Hello JAVA!!");
		System.out.printf("%d", 10);

		
		// java에서 ""는 문자열 ''는 한 글자 ex) "가나다", '가'
		
		
		// 변수
		// 타입 변수명 = 값;
		int num = 10; // 선언과 동시에 값을 부여
		num = 20; // 값을 재할당
		
		int num1; // 값을 선언
		num1 = 10; // 초기값 할당
		
		final String COMPANY = "KOREA IT"; // 상수 선언
		// COMPANY = "KOREA";
		
		char a = 'a';
		System.out.println(a);
		
		
	}

}
