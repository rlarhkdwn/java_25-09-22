package day03;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// break : 반복문을 빠져나오게 하는 키워드
		// 반복문에서 조건문(if)을 동반하여 조건이 맞을 때
		// 반복문을 벗어나게 하는 역할
		// for, while, do-while 모든 반복문에서 사용가능
		// continue : pass, skip 개념
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // 조건에 맞다면 pass
			}
			System.out.println(i);
		}
		
		System.out.println("======================");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // 조건에 맞다면 반복문 종료
			}
			System.out.println(i);
		}
		
		System.out.println("======================");
		
		// 1~10까지 짝수만 출력
		// 홀수면 continue
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("======================");
		
		// 한글자를 입력받아 그 한글자를 출력
		// char    scan.next().charAt(0)
		// 'y'면 종료
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		while (true) {
			System.out.println("y를 입력하면 종료");
			ch = scan.next().charAt(0);
			if (ch == 'y') {
				break;
			}
		}
		System.out.println("종료!");
		
		// 반복문이 중첩일 경우 break는 나를 감싸고 있는 가장 안쪽 for문을 벗어남
		// 반복문에 이름을 줄 수 있음
		int i = 0, j = 0, k = 0;
		a: for (;;) {
			i++;
			for(;;) {
				j++;
				for(;;) {
					k++;
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
					if (k == 10) {
						break a;
					}
				}
			}
		}
		
	}

}
