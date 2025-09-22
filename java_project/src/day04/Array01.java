package day04;

public class Array01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조 변수)
		// new 키워드로 생성
		// 배열 선언 방법
		// 타입[] 배열명;
		// 타입 배열명[];
		// 타입[] 배열명 = new 타입[길이];
		// 배열안의 변수값은 초기화가 자동으로 이루어진다.
		// int[] arr = new int[10]; // 가장 많이 사용하는 방법
		// int[] arr = new int[] {1, 2, 5, 4, 7, 8, 6};
		// int[] arr = {1, 2, 5, 4, 7, 8, 6};
		// 배열의 길이는 0이상이어야 한다. (음수는 허용안됨)
		// 배열의 index는 0부터 시작;
		// 배열[5] => 0, 1, 2, 3, 4
		// 배열의 총길이 => length	
		
		int[] arr1; // 선언만
		int[] arr2 = new int[5]; 
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		int[] arr4 = {10, 20, 30, 40, 50};
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		System.out.println("==============");
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		arr2[3] = 400;
		arr2[4] = 500;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		System.out.println("==============");
		
		int[] arr5 = new int[10];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = i + 1;
		}
		
		arr5[0] = 100;
		for (int a : arr5) {
			System.out.println(a);
		}
				
		System.out.println("==============");
		
		// int[] arr6을 생성하여 랜덤값 5개를 넣고 출력
		// 랜덤값은 1~10
		int[] arr6 = new int[5];
		for (int i = 0; i < arr6.length; i++) {
			arr6[i] = (int)(Math.random() * 10) + 1;
		}
		
		// 향상된 for문
		// 번지(index)로 접근이 불가능한 경우 사용
		// 전체 탐색만 가능
		// 배열의 내부값을 변경하는 건 불가능
		
		for (int a : arr6) {
			System.out.println(a);
		}
		
	}

}
