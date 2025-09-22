package day07;

public class Method05 {

	// 두 정수를 입력받아 최대 공약수를 리턴하는 메서드
	// 리턴 타입 : int
	// 매개변수 : int num1, int num2
	// 메서드명 : gcd
	public int gcd(int num1, int num2) {
		int i;
		for (i = Math.min(num1, num2); i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				break;
			}
		}
		return i;
	}
	
	// 두 정수를 입력받아 최대 공약수를 리턴하는 메서드
	// 리턴 타입 : int
	// 매개변수 : int num1, int num2
	// 메서드명 : lcm
	public int lcm(int num1, int num2) {
		for (int i = (Math.max(num1, num2)); ; i += (Math.max(num1, num2))) {
			if (i % Math.min(num1, num2) == 0) {
				return i;
			}
		}
	}
	
	public static void main(String[] args) {
		Method05 m5 = new Method05();
		int num1 = 12, num2 = 18;
		
		int gcd = m5.gcd(num1, num2);
		System.out.printf("%d, %d의 최대공약수 : %d\n", num1, num2, gcd);

		int lcm = m5.lcm(num1, num2);
		System.out.printf("%d, %d의 최소공배수 : %d\n", num1, num2, lcm);
	}
}