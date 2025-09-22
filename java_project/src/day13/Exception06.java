package day13;

import java.util.Scanner;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception06 e6 = new Exception06(); 
		
		Scanner scan = new Scanner(System.in);
		int size, start, count;
		
		System.out.print("size: ");
		size = scan.nextInt();
		System.out.print("start: ");
		start = scan.nextInt();
		System.out.print("count: ");
		count = scan.nextInt();
		try {
			int[] arr = e6.randomArray(size, start, count);
			for (int num : arr) {
				System.out.println(num);
			}
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// size를 입력받아 size의 길이를 가지는 배열을 생성
	// 랜덤값을 채워 배열을 리턴
	// 랜덤값의 범위는 start(시작), count(개수)
	// size가 0보다 작으면 예외발생
	// count가 0보다 작으면 예외발생
	// 리턴타입 : 배열 => int[]
	// 매개변수 : int size, int start, int count
	
	
	public int[] randomArray(int size, int start, int count) throws RuntimeException {
		if (size < 0 || count < 0) {
			throw new RuntimeException();
		}
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random() * count) + start;
		}
		return arr;
	}
	
	
}
