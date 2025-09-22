package day05;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열이 주어졌을 때
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색 결과가 없다면 => 일치하는 항목이 없습니다.
		String[] fileName = {
				"이것이자바다.java", "java의 정석.java", "Array.txt",
				"array.java", "String.png", "StringMethod.jpg",
				"ArrayMethod.java", "method.png", "javaMethod.jpg"
		};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("검색어를 입력하세요 => ");
		String userSearch = scan.nextLine();
		
		int searchCnt = 0;
		for (String s : fileName) {
			if (s.toLowerCase().contains(userSearch.toLowerCase())) {
				System.out.println(s);
				searchCnt++;
			}
		}
		
		if (searchCnt == 0) {
			System.out.println("일치하는 항목이 없습니다.");
		}

	}

}
