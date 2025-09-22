package day03;

public class Exam01 {

	public static void main(String[] args) {
		// 소수 : 약수를 1과 자기 자신만을 가지는 수
		// 2, 3, 5, 7, 11, ...
		// 1~100까지 소수만 출력
		
		for (int i = 2; i <= 100; i++) {
			int check = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					check = 1;
					break;
				}
			}
			if (check == 0) {
				System.out.println(i);
			}
		}
	}
}