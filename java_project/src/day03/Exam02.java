package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// up/down 게임
		/* 1~50까지의 랜덤수 하나를 생성
		 * 유저가 맞추는 게임
		 * ex) 컴퓨터가 랜덤수를 생성했습니다. 23(미공개)
		 * 입력 => 20
		 * up!
		 * 입력 => 30
		 * down!
		 * 입력 => 25
		 * down
		 * 입력 => 23
		 * 정답!
		 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		int targetNum = (int)(Math.random() * 50) + 1;
//		int userNum;
//		int tryCount = 5;
//		int userTryCount = 0;
//		
//		System.out.println("===숫자 맞추기 게임===");
//		System.out.println("컴퓨터가 무작위수를 생성했습니다.");
//		while (true) {
//			System.out.print("숫자를 입력하세요 => ");
//			userNum = scan.nextInt();
//			userTryCount++;
//			
//			if (userNum == targetNum) {
//				System.out.println("정답!");
//				System.out.printf("시도 횟수: %d", userTryCount);
//				break;
//			} else if (userNum >= targetNum) {
//				System.out.printf("down! 남은 시도 횟수: %d\n", tryCount - userTryCount);
//			} else {
//				System.out.printf("up! 남은 시도 횟수: %d\n", tryCount - userTryCount);
//			}
//			
//			if (userTryCount >= tryCount) {
//				System.out.printf("시도 횟수 초과!!");
//				break;
//			}
//		}
		
		
		// 숫자 야구 게임
		Scanner scan = new Scanner(System.in);
		
		int targetSize = 4;
		
		int[] targetNum = new int[targetSize];
		String userNum;
		int tryCount = 0;
		
		System.out.println("===숫자 야구 게임===");
		System.out.println("종료키: q");
		System.out.printf("컴퓨터가 %d자리 무작위수를 생성했습니다.\n", targetNum.length);
		System.out.println("각 자리는 0~9, 중복 제외");
		
		int i = 0;
		while (i < targetNum.length) {
			int num = (int)(Math.random() * 10);
			if (!isDuplicated(num, targetNum, i)) {
				targetNum[i] = num;
				i++;
			}	
		}
		
		while (true) {
			int strike = 0;
			int ball = 0;
			
			System.out.print("숫자 4자리를 입력하세요 => ");
			userNum = scan.nextLine();
			
			if (userNum.equals("q")) {
				return;
			}
			
			if (userNum.length() != targetNum.length) {
				System.out.println("유호하지 않은 자리수입니다.");
				continue;
			}
			
			for (i = 0; i < targetNum.length; i++) {
				if (targetNum[i] == (int)userNum.charAt(i) - '0') {
					strike++;
				}
			}
			
			for (i = 0; i < targetNum.length; i++) {
				for (int j = 0; j < targetNum.length; j++) {
					if (targetNum[i] == (int)userNum.charAt(j) - '0' && i != j) {
						ball++;
					}
				}
			}
			
			tryCount++;
			if (strike == targetNum.length) {
				System.out.printf("정답!! 시도한 횟수: %d\n", tryCount);
				break;
			} else {
				System.out.printf("strike: %d\n", strike);
				System.out.printf("ball %d\n", ball);
			}
			
		}
			
	}
	
	public static boolean isDuplicated(int num, int[] numArray, int idx) {
		for (int i = 0; i < idx; i++) {
			if (numArray[i] == num) {
				return true;
			}
		}
		return false;
	}

}
