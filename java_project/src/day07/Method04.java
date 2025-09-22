package day07;

public class Method04 {

	// 정수 하나를 매개변수로 입력받아(2~9)
	// 해당 정수의 구구단을 출력하는 메서드
	// 리턴타입 : void
	// 매개변수 : int
	// 메서드명 : multi
	public static void multi(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %2d\n", num, i, num * i);
		}
	}
	
	public static void main(String[] args) {
//		int num = 3;
//		multi(num);
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("====" + i + "단====");
			multi(i);
		}
		
	}

}
