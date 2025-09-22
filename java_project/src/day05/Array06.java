package day05;

public class Array06 {

	public static void main(String[] args) {
		// String 배열
		
		String[] arr1 = new String[5];
		arr1[0] = "홍길동";
		arr1[1] = "박영이";
		arr1[2] = "최순자";
		arr1[3] = "이길동";
		arr1[4] = "황길동";
				
		// 출력
		for (String s : arr1) {
			System.out.println(s);
		}
		
		int num1 = 1;
		int num2 = num1;
		
		System.out.println("========arr2========");

		String[] arr2 = arr1;
		for (String s : arr2) {
			System.out.println(s);
		}
		
		// 배열 복사
		String[] arr3 = new String[10];
//		for (int i = 0; i < arr1.length; i++) {
//			arr3[i] = arr1[i];
//		}
		
		System.arraycopy(arr1, 0, arr3, 1, arr1.length);
		arr3[5] = "홍길동";
		
		arr1 = arr3; // 배열 바꾸기
		arr1[6] = "바둑이";
		
		System.out.println("========arr3========");
		
		for (String s : arr1) {
			System.out.println(s);
		}
		
		System.out.println("========arraycopy========");

		for (String s : arr1) {
			System.out.println(s);
		}
	}

}
