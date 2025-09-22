package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 생년을 숫자로 입력받아 어린이(13), 청소년(19), 성인으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료를 출력
		// ex) 2017 입력 => 9세 어린이입니다. 입장료는 5000원입니다.
		// 생년월일을 기준으로 나이를 구하기. 2025 - 2017
		
		Scanner scan = new Scanner(System.in);
		
		int year;
		int age;
		
		while (true) {
			System.out.print("생년 4자리를 입력해주세요 => ");
			year = scan.nextInt();
			age = 2025 - year + 1;
			
			if (1 <= age && age <= 122) {
				break;
			}
			System.out.println("유효하지 않은 생년입니다.");
		}
		
		if (age <= 13) {
			System.out.printf("%d세 어린이입니다. 입장료는 5000원입니다.", age);
		}
		else if (age <= 19) {
			System.out.printf("%d세 청소년입니다. 입장료는 7000원입니다.", age);
		}
		else {
			System.out.printf("%d세 성인입니다. 입장료는 10000원입니다.", age);
		}
		
	}

}