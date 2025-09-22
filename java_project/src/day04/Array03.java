package day04;

public class Array03 {

	public static void main(String[] args) {
		// arr배열의 최대값, 최소값, 합계, 평균 출력
		int[] arr = {89, 78, 58, 69, 84, 51, 26, 35, 69, 75, 96};
		int max = 0, min = 100, sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.printf("최대값 : %d, 최소값 : %d, 합계 : %d, 평균 : %.2f", max, min, sum, (double)sum / arr.length);
	}
}
