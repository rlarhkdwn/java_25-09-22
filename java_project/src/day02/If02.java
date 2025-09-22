package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아
		// 합계, 평균, pass여부를 출력
		// pass 기준 : 평균이 80이상
		// return : 리턴값을 주고 해당 메서드를 종료
		// method return void => 리턴값이 없음
		
		Scanner scan = new Scanner(System.in);
		int kor, eng, math, sum;
		double avg;
		String result;
		
		System.out.println("국어 점수를 입력하세요");
		kor = scan.nextInt();

		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextInt();

		System.out.println("수학 점수를 입력하세요");
		math = scan.nextInt();
		
		if (0 <= kor && kor <= 100 && 0 <= eng && eng <= 100 && 0 <= math && math <= 100) {
			sum = kor + eng + math;
			avg = sum / 3.0;
			
			result = avg >= 80 ? "pass" : "non-pass";
			
			System.out.printf("합계: %d, 평균: %.2f, 결과: %s", sum, avg, result);
		}
		else {
			System.out.println("유효하지 않은 점수입니다.");
		}
		
		
	}

}
