package day03;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// 메뉴 구성
		// 1. 저장하기 | 2. 새로 만들기 | 3. 종료하기
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("=====menu=====");
			System.out.println("1. 저장하기 | 2. 새로 만들기 | 3. 종료하기");
			System.out.print("메뉴를 선택하세요 => ");
			num = scan.nextInt();
			
			switch (num) {
			case 1: System.out.println("저장 되었습니다."); break;
			case 2: System.out.println("새로 만들었씁니다."); break;
			case 3: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다.");
			}	
		} while (num != 3);

	}

}
