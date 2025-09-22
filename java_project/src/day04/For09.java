package day04;

public class For09 {

	public static void main(String[] args) {
		// 이중 for문
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		// *****
		// ****
		// ***
		// **
		// *
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 4 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
