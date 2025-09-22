package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 정수 2개와 연산자 1개를 입력받아 두 정수를 연산결과를 출력
		 * ex) 2 3 + => 2+3=5
		 * 연산자가 +, -, *, /, % 중 하나가 아니라면
		 * 잘못된 연산자라고 출력
		 * ex) 3 2 ! => 잘못된 연산자
		 * %, /의 피연산자가 0일수 없음
		 * ex) 2 0 / => 0으로 나눌 수 없습니다.
		 * String 클래스는 ==로 비교할 수 없음
		 * equals()
		 */
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		String op;
		
		System.out.print("첫번째 정수를 입력하세요 => ");
		num1 = scan.nextInt();
		scan.nextLine();

		System.out.print("연산자를 입력하세요 => ");
		op = scan.nextLine();
		
		System.out.print("두번째 정수를 입력하세요 => ");
		num2 = scan.nextInt();
		
		if (op.equals("+")) {
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		}
		else if (op.equals("-")) {
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
		}
		else if (op.equals("*")) {
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
		}
		else if (op.equals("/")) {
			if (num2 != 0) {
				System.out.printf("%d / %d = %.4f", num1, num2, (double)num1 / num2);
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		else if (op.equals("%")) {
			if (num2 != 0) {
				System.out.printf("%d %% %d = %d", num1, num2, num1 % num2);
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		else {
			System.out.println("잘못된 연산자");
		}
		
	}

}
