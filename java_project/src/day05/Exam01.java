package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 야구게임
		// 컴퓨터가 랜덤으로 3자리의 숫자를 생성
		// 각 자리의 수는 0~9(중복 불가)
		// => 배열로 저장(무작위)(중복 불가)
		// 유저가 3자리를 맞추는 게임
		// 자리와 숫자가 같이 일치하면 strike
		// 자리는 불일치, 숫자만 일치하면 ball
		// 자리도 숫자도 안맞으면 out
		// 
		// ex) com: 1 2 3
		// user: 1 5 9 => 1s
		// user: 2 5 8 => 1b
		// user: 7 8 9 => out
		// user: 1 9 5 => 1s
		// user: 1 2 8 => 2s
		// user: 1 3 2 => 1s 2b
		// user: 1 2 3 => 3s 정답
		// 숫자 야구 게임
		
		Scanner scan = new Scanner(System.in);
		
		int targetSize = 3;
		
		int[] targetNum = new int[targetSize];
		String userNum;
		int tryCount = 0;
		
		System.out.println("===숫자 야구 게임===");
		System.out.println("종료키: q");
		System.out.printf("컴퓨터가 %d자리 무작위수를 생성했습니다.\n", targetNum.length);
		System.out.println("각 자리는 0~9, 중복 제외");
		
		int len = 0;
		while (len < targetNum.length) {
			int num = (int)(Math.random() * 10);
			boolean isDuplicated = false;
			for (int i = 0; i < len; i++) {
				if (targetNum[i] == num) {
					isDuplicated = true;
					break;
				}
			}
			if (!isDuplicated) {
				targetNum[len] = num;
				len++;
			}
		}
		
		a : while (true) {
			int strike = 0;
			int ball = 0;
			
			System.out.printf("숫자 %d자리를 입력하세요 => ", targetSize);
			userNum = scan.nextLine();
			
			// 종료
			if (userNum.equals("q")) {
				System.out.println("게임을 종료합니다.");
				return;
			}
			
			// 숫자 범위 체크
			for (int i = 0; i < userNum.length(); i++) {
				if ((int)userNum.charAt(i) - '0' < 0 || (int)userNum.charAt(i) - '0' > 9) {
					System.out.println();
					System.out.println("유효하지 않은 범위입니다. 0부터 9사이의 숫자를 입력하세요.");
					continue a;
				}
			}
			
			// 숫자 자리수 체크
			if (userNum.length() != targetNum.length) {
				System.out.println();
				System.out.printf("유효하지 않은 자리수입니다. %d자리 숫자를 입력하세요.\n", targetSize);
				continue;
			}
			
			// 숫자 중복 체크
			for (int i = 1; i < userNum.length(); i++) {
				if (userNum.substring(0, i).contains(userNum.substring(i, i + 1))) {
					System.out.println();
					System.out.println("중복된 숫자는 입력할 수 없습니다. 다시 입력해주세요.");
					continue a;
				}
			
			}
			// strike, ball 계산
			for (int i = 0; i < targetNum.length; i++) {
				for (int j = 0; j < targetNum.length; j++) {
					if (targetNum[i] == (int)userNum.charAt(j) - '0' && i == j) {
						strike++;
					}
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
				if (strike + ball > 0) {
					System.out.println();
					System.out.printf("strike: %d\n", strike);
					System.out.printf("ball %d\n", ball);
				}
				else {
					System.out.println("out");
				}
			}
		}	
	}
}