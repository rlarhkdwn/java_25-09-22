package day06;

public class Method03 {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	
	public int mod(int num1, int num2) {
		return num1 % num2;
	}
	
	
	
	public static void main(String[] args) {
		// +, -, *, /, % 기능을 하는 메서드를 생성
		// main에서 호출 => 출력
		
		Method03 m = new Method03();
		
		int num1 = 10, num2 = 20;
		// 두 수의 +, -, *, /, %의 결과를 메서드를 호출하여 출력
		System.out.println("+ : " + m.add(num1, num2));
		System.out.println("- : " + m.sub(num1, num2));
		System.out.println("* : " + m.mul(num1, num2));
		System.out.println(num2 != 0 ? "/ : " + m.div(num1, num2) : "0으로 나눌 수 없습니다.");
		System.out.println(num2 != 0 ? "% : " + m.mod(num1, num2) : "0으로 나눌 수 없습니다.");
		
	}

}
