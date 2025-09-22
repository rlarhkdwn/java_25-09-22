package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 배열
		 * 5개의 숫자 값을 가지는 배열을 생성
		 * 1, 2, 3, 4, 5 입력 / 출력
		 */

		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번째 숫자 입력 => ", i + 1);
			intArray[i] = scan.nextInt();
		}
		
		System.out.println("================");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번째 숫자 출력 => %d\n", i + 1, intArray[i]);
		}
	}

}
