package day01;

public class Exam01 {

	public static void main(String[] args) {
		// 문제
		// 국어, 영어, 수학 점수를 변수로 선언, 값 할당
		// 합계와 평균 출력
		// 출력 예시: 국어: 89, 영어: 79, 수학: 93
		// 			합계: xxx, 평균: xxx, 결과: 합격
		// 조건 선택 연산자를 이용하여 평균이 80이상이면 합격, 아니면 불합격

		int kor = 89, eng = 79, math = 92;
		int sum = kor + eng + math;
		float avg = sum / 3.0f;
		String result = avg >= 80 ? "합격" : "불합격";
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", kor, eng, math);
		System.out.printf("합계: %d, 평균: %.2f, 결과: %s\n", sum, avg, result);
		
	}

}