package day06;

import java.util.Scanner;

public class MethodExam01 {

	public static void main(String[] args) {
		// 게산기 만들기
		// =====menu=====
		// 1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4.나눗셈 | 5. 나머지 | 6. 종료
		// 메뉴선택 => 1
		// 숫자 입력(두 정수) => 1 5
		// 결과 : 1 + 5 = 6
		// 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지는 Method03에서 만든 메서드를 호출
		
		Scanner scan = new Scanner(System.in);
		Method03 m3 = new Method03();
		String input;
		
		while (true) {
			// 메뉴 입력
			while (true) {
				printMenu();
				input = scan.nextLine();
				if (input.length() == 1 && (int)input.charAt(0) - '0' >= 1 && (int)input.charAt(0) - '0' <= 6) {
					break;
				}
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			// 종료
			if (input.equals("6")) {
				System.out.println("계산기를 종료합니다.");
				scan.close();
				return;
			}
			
			// 숫자 입력
			System.out.printf("첫번째 정수를 입력하세요 => ");
			int num1 = scan.nextInt();
			scan.nextLine();
			System.out.printf("두번째 정수를 입력하세요 => ");
			int num2 = scan.nextInt();
			scan.nextLine();
			
			if ((input.equals("4") || input.equals("5")) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}

			switch (input) {
			case "1": printOutput(num1, num2, m3.add(num1, num2), "+"); break;
			case "2": printOutput(num1, num2, m3.sub(num1, num2), "-"); break;
			case "3": printOutput(num1, num2, m3.mul(num1, num2), "*"); break;
			case "4": printOutput(num1, num2, m3.div(num1, num2), "/"); break;
			case "5": printOutput(num1, num2, m3.mod(num1, num2), "%"); break;
			}
		}	
	}
	
	public static void printMenu() {
		System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4.나눗셈 | 5. 나머지 | 6. 종료");
		System.out.print("메뉴를 선택해주세요 => ");
	}
	
	public static void printOutput(int num1, int num2, int result, String op) {
		System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
	}
	
	public static void printOutput(int num1, int num2, double result, String op) {
		System.out.printf("%d %s %d = %.2f\n", num1, op, num2, result);
	}
}