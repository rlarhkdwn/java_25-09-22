package day04;

public class For08 {

	public static void main(String[] args) {
		// 구구단 2~9단까지
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d", i, j, i * j);
				if (j < 9) {
					System.out.print("    ");
				}
				else {
					System.out.println();	
				}
			}
		}
		
		System.out.println("========================");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %2d", j, i, i * j);
				if (j < 9) {
					System.out.print("    ");
				}
				else {
					System.out.println();	
				}
			}
		}
	}
}
