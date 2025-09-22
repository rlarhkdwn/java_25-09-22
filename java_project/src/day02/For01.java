package day02;

public class For01 {

	public static void main(String[] args) {
		// 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		// for, while, do-while
		// for, while은 동작 방식이 같음
		// => 조건에 맞지 않으면 한번도 실행되지 않을 수 있음
		// do-while
		// 조건에 맞지 않아도 무조건 1번은 실행함
		//
		// 조건식에 맞으면 실행
		// for (1초기화; 258조건식; 47증감식) {
		// 		36실행문;
		// }
		// 초기화 : 실행문을 반복하기 위한 변수를 초기화, 처음 1회만 실행, 생략 가능
		// 조건식 : 반복을 결정하는 식, true일때 반복, 생략 가능
		// 증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복 횟수를 조절, 생략 가능
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello!!");
			System.out.println(i);
		}
		// i++ => i = i + 1
		
		System.out.println("==============================");
		
		// i가 짝수인 수만 출력
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
		}
		
		System.out.println("==============================");
		
		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("==============================");
		
		// 1부터 10까지 합계 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("==============================");
		
		// 1부터 10까지 짝수합 / 홀수합
		int odd = 0, even = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.println("짝수합" + even);
		System.out.println("홀수합" + odd);
		
		
	}

}
