package day09;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// 레포트 배열
		// 데이터(학생 수)크기 스케너로 받기
		// 순위 계산
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 => ");
		int testSize = scan.nextInt();
		scan.nextLine();
		
		Report[] rArr = new Report[testSize];
		
		for (int i = 0; i < testSize; i++) {
//			System.out.print("이름 => ");
//			String name = scan.nextLine();
//
//			System.out.print("국어 점수 => ");
//			int kor = scan.nextInt();
//			scan.nextLine();
//
//			System.out.print("영어 점수 => ");
//			int eng = scan.nextInt();
//			scan.nextLine();
//
//			System.out.print("수학 점수 => ");
//			int math = scan.nextInt();
//			scan.nextLine();
			
			
			String name = String.valueOf((int)(Math.random() * 101));
			int kor = (int)(Math.random() * 101);
			int eng = (int)(Math.random() * 101);
			int math = (int)(Math.random() * 101);
			
			
			Report r = new Report(name, kor, eng, math);
			rArr[i] = r;
		}
		
		// 등수 계산
		for (int i = 0; i < testSize - 1; i++) {
			for (int j = i + 1; j < testSize; j++) {
				if (rArr[i].getSum() > rArr[j].getSum()) {
					rArr[j].setRank(rArr[j].getRank() + 1);
				}
				else if (rArr[i].getSum() < rArr[j].getSum()) {
					rArr[i].setRank(rArr[i].getRank() + 1);
				}
			}
		}
		
		// 출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\t\n");
		for (int i = 0; i < testSize; i++) {
			System.out.println(rArr[i]);
		}
	}
}