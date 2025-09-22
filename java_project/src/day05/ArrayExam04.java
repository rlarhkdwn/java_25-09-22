package day05;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExam04 {

	public static void main(String[] args) {
		// 정수배열 [10] => 1~100까지의 무작위수 저장 => 출력
		// 오름차순 정렬 후 출력
		Integer[] integerArray = new Integer[10];
		int[] intArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random() * 100) + 1;
			integerArray[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(integerArray));
		
		System.out.println("===============================");
		
//		for (int i = 0; i < intArray.length - 1; i++) {
//			for (int j = i + 1; j < intArray.length; j++) {
//				if (intArray[i] > intArray[j]) {
//					int temp = intArray[i];
//					intArray[i] = intArray[j];
//					intArray[j] = temp;
//				}
//			}
//		}

		Arrays.sort(intArray); // 기본 자료형의 배열로는 내림차순 불가능
		Arrays.sort(integerArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(integerArray));
	}
}