package day06;

import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		// 테스트 참가인원 => 3
		// 이름	국어	영어	수학	합계	평균 	등수
		// hong 89  85  75  00  00  00
		// ..
		// ..
		
		Scanner scan = new Scanner(System.in);

		System.out.print("테스트 참가인원 입력 => ");
		int testSize = scan.nextInt();
		scan.nextLine();
		
		String[] names = new String[testSize];
		String[] subjects = {"국어", "영어", "수학"};
		int[][] scores = new int[testSize][subjects.length];
		int[] totals = new int[testSize];
		int[] ranks = new int[testSize];
		
		// 입력
		for (int i = 0; i < testSize; i++) {
			System.out.print(i + 1 + "번째 이름 => ");
			names[i] = scan.nextLine();
			
			for (int j = 0; j < subjects.length; j++) {
//				System.out.printf("%s 점수 => ", subjects[j]);
//				int score = scan.nextInt();
//				scan.nextLine();
				int score = (int)(Math.random() * 61) + 40;
				scores[i][j] = score;
				totals[i] += score; 
			}
		}
		
		// 등수 계산
		for (int i = 0; i < testSize - 1; i++) {
			for (int j = i + 1; j < testSize; j++) {
				if (totals[i] > totals[j]) {
					ranks[j] += 1;
				}
				else if (totals[i] < totals[j]) {
					ranks[i] += 1;
				}
			}
		}
		
		// 출력
		System.out.printf("%s\t", "이름");
		for (int j = 0; j < subjects.length; j++) {
			System.out.printf("%-7s", subjects[j]);
		}
		System.out.printf("%s\t%s\t%s\t\n", "합계", "평균", "등수");
		
		for (int i = 0; i < testSize; i++) {
			System.out.printf("%s\t", names[i]);
			for (int j = 0; j < subjects.length; j++) {
				System.out.printf("%s\t", scores[i][j]);
			}
			System.out.printf("%s\t%.2f\t%s\t\n", totals[i], (double)totals[i] / subjects.length, ranks[i] + 1);
		}
	}
}