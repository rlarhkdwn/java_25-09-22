package day04;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 5명의 점수를 입력받기.
		// 1. 배열 생성
		// 2. 배열에 점수를 입력받기 (0~100)
		// 3. 배열의 점수를 출력
		// 4. 점수의 합계 / 평균을 출력
		
		Scanner scan = new Scanner(System.in);
		int[] scoreArray = new int[5];
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번째 점수를 입력하세요 => ", i + 1);
			int score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("유효하지 않은 점수입니다. 다시 입력해주세요.");
				i--;
				continue;
			}
			scoreArray[i] = score;
			sum += scoreArray[i];
		}
		
		System.out.println();
		
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.printf("%d번째 점수 : %d점\n", i + 1, scoreArray[i]);
		}
		
		avg = (double)sum / scoreArray.length;
		
		System.out.printf("합계 : %d점, 평균 : %.1f점", sum, avg);

	}

}
