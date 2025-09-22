package day05;

import java.util.Arrays;

public class ArrayExam03 {

	public static void main(String[] args) {
		// 정수 배열[10] 생성 후
		// 1~10까지 저장 후 출력
		
		int[] intArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(intArray));
		
		System.out.println("===============================");
		
		// 교환에 필요한 랜덤 번지 추출 0~9
		
		for (int i = 0; i < intArray.length; i++) {
			// 교환에 필요한 번지 추출
			int index = (int)(Math.random() * intArray.length);
			// 교환
			int temp = intArray[i];
			intArray[i] = intArray[index];
			intArray[index] = temp;
		}
		
		System.out.println(Arrays.toString(intArray));
		
		System.out.println("===============================");
		
		// [5, 3, 1, 2, 4]
		// 원래대로 정렬
		// 작은 수 부터 정렬 => 오름차순
		// 큰 수 부터 정렬 => 내림차순
		// [5, 3, 1, 2, 4]
		// [1, 5, 3, 2, 4] - 1pass
		// [1, 2, 5, 3, 4] - 2pass
		// [1, 2, 3, 5, 4] - 3pass
		// [1, 2, 3, 4, 5] - 4pass
		
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(intArray));
		
	}

}
