package day05;

public class Array05 {

	public static void main(String[] args) {
		// 10개의 숫자 값을 가지는 배열 생성
		// 1~50까지의 랜덤 수를 배열에 저장 / 출력
		// 최대, 최소, 합계, 평균 출력
		
		int[] intArray = new int[10];
		int max = 0, min = 50, sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random() * 50) + 1;
			max = Math.max(max, intArray[i]);
			min = Math.min(min, intArray[i]);
			sum += intArray[i];
		}
				
		for(int i = 0; i < intArray.length; i++) {
			System.out.printf("%d번째 숫자 출력 => %d\n", i + 1, intArray[i]);
		}
		System.out.printf("최대: %d, 최소: %d, 합계: %d, 평균: %.2f", max, min, sum, (double)sum / intArray.length);

	}

}
