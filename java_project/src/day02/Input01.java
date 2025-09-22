package day02;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Input 
		// 콘솔 입력
		// console input : 콘솔에서 값을 입력받는 것을 의미
		// Scanner 클래스: 객체를 생성시 new 키워드 사용
		// 클래스타입 객체명 = new 클래스명(값);
		// 객체명.next() : 한 단어를 입력(공백 포함 안함)
		// 객체명.nextLine() : 여러단어를 입력 (공백 포함), Enter 인지
		// 객체명.nextInt() : 정수 입력
		// 객체명.next자료형() : 자료형에 맞는 값을 입력
		
		
		// String은 워낙 많이 쓰는 클래스라서 new 키워드 없이 생성 가능
//		String str = "abc";
//		System.out.println(str);
//		
//		String str2 = new String();
//		str2 = "bcd";
//		System.out.println(str2);
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자 입력 => ");
//		int inputNum = scan.nextInt();
//		System.out.println(inputNum + 10);
//		
//		System.out.print("문자 입력 => ");
//		String inputStr = scan.next();
//		System.out.println("입력 받은 문자: " + inputStr);
//		
//		scan.nextLine(); // 버퍼에 남아있는 값을 처리
//		
//		System.out.print("여러 문자 입력 => ");
//		String inputStr2 = scan.nextLine();
//		System.out.println("입력 받은 문자열: " + inputStr2);
		
		// 입력받은 수가 짝수인지 홀수인지 판별하세요.
		System.out.print("정수를 입력하세요 => ");
		int inputNum2 = scan.nextInt();
		System.out.println(inputNum2 % 2 == 0 ? "짝수" : "홀수");
		
	}

}
