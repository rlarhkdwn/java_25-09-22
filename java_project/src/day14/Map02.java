package day14;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목과 점수를 입력받아 map에 저장
		// 출력 / 합계 / 평균
		// 종료 키워드가 나올 때까지 반복(1 = 계속 / 0 = 종료)
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		
		int sum = 0;
		
		while (true) {
			int num = 1;
			try {
				System.out.println("(1 = 계속 / 0 = 종료)");
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다.");
			}
			scan.nextLine();
			
			if (num == 0) {
				System.out.println("종료");
				break;
			} else if (num == 1) {
				System.out.print("과목: ");
				String Key = scan.nextLine();
				System.out.println("점수: ");
				int value = scan.nextInt();
				scan.nextLine();
				sum += value;
				map.put(Key, value);
				
			}
			
		}
		
		System.out.println(map);
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum / map.size());
		scan.close();
	}

}
