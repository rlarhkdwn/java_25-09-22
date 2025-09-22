package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위바위보 게임
		// 컴퓨터와 유저가 가위바위보 게임을 진행
		// 가위 = 0, 바위 = 1, 보 = 2
		// 컴퓨터도 랜덤으로 0, 1, 2 중 하나 선택
		// ex)
		// com) = 0 / me = 0
		// com(가위) / me(가위) => 무승부
		// com) = 0 / me = 2
		// com(가위) / me(보) => me 패배!!
		
		Scanner scan = new Scanner(System.in);
		
		String[] choice = {"가위", "바위", "보"};
		int comNum;
		int userNum;
		
		while (true) {
			System.out.println("=====menu=====");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 종료");
			System.out.print("=> ");
			int menu = scan.nextInt();
		
			switch (menu) {
			case 1:
				System.out.println("게임 시작!!");
				
				while (true) {
					System.out.println("0(가위), 1(바위), 2(보) 중 하나를 선택하세요.");
					System.out.print("=> ");
					userNum = scan.nextInt();
					
					if (userNum == 0 || userNum == 1 || userNum == 2) {
						break;
					}
					System.out.println("잘못 선택했습니다.");
				}
				
				comNum = (int)(Math.random() * 3);
				
				System.out.printf("com: %d(%s), user: %d(%s), ", comNum, choice[comNum], userNum, choice[userNum]);
				switch (userNum) {
				case 0:
					switch (comNum) {
					case 0: System.out.println("결과: 무승부!!"); break;
					case 1: System.out.println("결과: 패배!!"); break;
					case 2: System.out.println("결과: 승리!!"); break;
					} break;
				case 1:
					switch (comNum) {
					case 0: System.out.println("결과: 승리!!"); break;
					case 1: System.out.println("결과: 무승부!!"); break;
					case 2: System.out.println("결과: 패배!!"); break;
					} break;
				case 2:
					switch (comNum) {
					case 0: System.out.println("결과: 패배!!"); break;
					case 1: System.out.println("결과: 승리!!"); break;
					case 2: System.out.println("결과: 무승부!!"); break;
					} break;
				} break;
			case 2:
				System.out.println("게임을 종료합니다.");
				return;
			default:
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
		}	
	}
}
