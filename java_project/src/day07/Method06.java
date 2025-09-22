package day07;

public class Method06 {

	// 메서드의 배열활용
	// 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	public int[] getRandomIntArray() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 101);
		}
		return arr;
	}
	
	// 2. 1에서 만든 배열을 입력받아 평균을 리턴하는 메서드
	public double getAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum / arr.length;
	}
	
	// 3. 1에서 만든 배열을 출력하고, 2번에서 만든 평균을 출력하는 메서드
	public void printArray() {
		int[] arr = getRandomIntArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		System.out.printf("평균: %.2f", getAvg(arr));
	}
	
	public static void main(String[] args) {
		Method06 m6 = new Method06();
		m6.printArray();
	}
}