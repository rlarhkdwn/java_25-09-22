package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		// 6의 약수는 1, 2, 3, 6
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		int num = scan.nextInt();
		System.out.printf("%d의 약수 => ", num);
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				if (i < num) {
					System.out.print(", ");
				}
			}
		}

	}

}
