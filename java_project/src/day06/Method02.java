package day06;

public class Method02 {

	// 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	public int returnSum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	public void printSum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 매개변수가 없는 케이스 / 리턴타입도 없음
	public void sum1() {
		int num1 = 20;
		int num2 = 30;
		System.out.println(num1 + num2);
	}
	
	// 매개변수가 없는 케이스 / 리턴타입은 있음
	public int sum2() {
		int num1 = 10;
		int num2 = 50;
		return num1 + num2;
	}
		
	public static void main(String[] args) {
		Method02 me1 = new Method02();
		
		System.out.println(me1.returnSum(12, 34));
		me1.printSum(78, 92);

		me1.sum1();
		System.out.println(me1.sum2());
		
	}

}
