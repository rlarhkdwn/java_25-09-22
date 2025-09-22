package day03;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		// 배수 : 값을 1부터 곱해서 나오는 값
		// 10의 배수 : 10, 20, 30, ...
		// 15의 배수 : 15, 30, 45, ...
		// 공배수 : 두 수의 공통된 배수
		// 최소 공배수 : 30

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 => ");
		int num1 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("첫번째 정수를 입력하세요 => ");
		int num2 = scan.nextInt();
		scan.nextLine();
		
		for (int i = (Math.max(num1, num2)); ; i += (Math.max(num1, num2))) {
			if (i % Math.min(num1, num2) == 0) {
				System.out.printf("%d, %d의 최소 공배수 => %d\n", num1, num2, i);
				break;
			}
		}
		
	}

}
