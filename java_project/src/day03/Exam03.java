package day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* ===== menu =====
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 1번 선택 => 두 수를 입력해주세요. => 3 2
		 * 3 + 2 = 5
		 * ...
		 * 4, 5번 선택 => 3 0 => num2를 다시 입력해주세요
		 */
		
		Scanner scan = new Scanner(System.in);
		int userChoice;
		int num1, num2;
		
		while (true) {
			System.out.println("===== menu =====");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			userChoice = scan.nextInt();
			
			switch (userChoice) {
			case 1: case 2: case 3: case 4: case 5:
				break;
			case 6:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.\n");
				continue;
			}
			
			System.out.print("첫번째 정수를 입력해주세요 =>");
			num1 = scan.nextInt();
			System.out.print("두번째 정수를 입력해주세요 =>");
			num2 = scan.nextInt();
			
			while ((userChoice == 4 || userChoice == 5) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println("두번째 정수를 다시 입력해주세요");
				num2 = scan.nextInt();	
			}
			
			switch (userChoice) {
			case 1: System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2); break;
			case 2: System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2); break;
			case 3: System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2); break;
			case 4: System.out.printf("%d / %d = %.2f\n", num1, num2, (double)num1 / num2); break;
			case 5: System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2); break;
			}
		}	
	}
}
