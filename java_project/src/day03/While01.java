package day03;

public class While01 {

	public static void main(String[] args) {
		// while문
		/* while문은 for문과 순서가 동일한 구문
		 * for : 실행 횟수가 정해져 있는 경우 많이 사용
		 * while : 실행 횟수가 일정하지 않은 경우 많이 사용
		 * 
		 * 조건식에 사용될 변수 초기화
		 * while (조건식) { 조건식은 true일 때 반복
		 * 		실행문;
		 * 		조건식이 바뀔 수 있는 증감 변화가 있어야 함
		 * }
		 */

		// 1~10까지 i값 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
		
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("=========================");
		
		// 짝수만 출력
		i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);	
			}
			i++;
		}
		
		System.out.println("=========================");
		
		// 1~50 짝수만 출력
		// 2 4 6 8 10
		// 12 14 16 18 20
		// ...
		// 42 44 46 48 50
		i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.printf("%2d", i);	
				if (i % 10 == 0) {
					System.out.println();
				}
				else {
					System.out.print(" ");
				}
			}
			i++;
		}
		
	}

}
