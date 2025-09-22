package day07;

import day06.Method03;

public class MethodExam02 {
	
	public static void main(String[] args) {
		// 메서드 생성
		// 1. 배열을 받아 배열을 출력하는 메서드
		// 2. 배열을 받아 배열을 오름차순으로 정렬하는 메서드
		// 3. 배열을 받아 배열의 합계와, 평균, 최대, 최소를 출력하는 메서드

		int[] arr = {78, 56, 96, 85, 75, 42, 63, 42, 59, 65, 45, 39, 96};
		MethodExam02 me2 = new MethodExam02();
		
		System.out.println("=====정렬 전 배열=====");
		me2.printArray(arr);
		me2.sort(arr);
		System.out.println("=====정렬 후 배열=====");
		me2.printArray(arr);
		System.out.println("=====배열 정보=====");
		me2.printArrayInfo(arr);
		
		System.out.println("================================");
		
		// getRandomIntArray()호출 배열 생성
		// 출력 => 정렬 => 출력
		Method06 m6 = new Method06();
		System.out.println("=====정렬 전 배열=====");
		int[] randomArray = m6.getRandomIntArray();
		me2.printArray(randomArray);
		System.out.println("=====정렬 후 배열=====");
		me2.sort(randomArray);
		me2.printArray(randomArray);
		System.out.println("=====배열 정보=====");
		me2.printArrayInfo(randomArray);
		
		// day06 패키지에 있는 Method03 클래스 => add()호출
		Method03 m3 = new Method03();
		m3.add(10, 20);
	}

	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	public void sort(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}
	
	public void printArrayInfo(int[] intArray) {
		System.out.printf("합계: %d, 평균: %.2f, 최대: %d, 최소: %d\n", 
				sumArray(intArray), 
				(double)sumArray(intArray) / intArray.length,
				maxArray(intArray),
				minArray(intArray));
	}
	
	public int sumArray(int[] intArray) {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		return sum;
	}

	public int maxArray(int[] intArray) {
		int max = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			max = Math.max(max, intArray[i]);
		}
		return max;
	}
	
	public int minArray(int[] intArray) {
		int min = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			min = Math.min(min, intArray[i]);
		}
		return min;
	}
}