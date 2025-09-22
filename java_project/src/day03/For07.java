package day03;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		// 숫자를 입력받아 그 수가 소수인지 아닌지 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자연수를 입력하세요 => ");
		int num = scan.nextInt();
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.printf("%d는 소수가 아닙니다.", num);
				return;
			}
		}
		System.out.printf("%d는 소수입니다.", num);

	}

}
