package day06;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		// 0이나 음수를 입력하면 종료
		// 출력 : 3+5+4+8+9 0 = 합, 평균

		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[0];
		int cnt = 0;
		int sum = 0;
		
		while (true) {
			System.out.print("0보다 큰 숫자를 입력하세요 => ");
			int num = scan.nextInt();
			
			// 종료
			if (num <= 0) {
				break;
			}
			
			// 배열 확장
			if (cnt >= intArray.length) {
				int[] newArray = new int[cnt + 1];
				System.arraycopy(intArray, 0, newArray, 0, intArray.length);
				intArray = newArray;
			}
			
			// 배열 저장
			intArray[cnt] = num;
			cnt++;
			sum += num;			
		}
		
		if (cnt > 0) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(intArray[i]);
				if (i == intArray.length - 1) {
					System.out.println(" = " + sum);
					System.out.printf("평균: %.2f", (double)sum / cnt);
				}
				else {
					System.out.print(" + ");
				}
			}
		}
		else {
			System.out.println("입력한 숫자가 없습니다.");
		}	
	}
}