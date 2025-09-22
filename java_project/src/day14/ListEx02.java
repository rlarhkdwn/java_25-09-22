package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		// 숫자를 입력받아서 리스트 생성
		// 출력 => 전체 합계 출력
		//
		// ex) 입력 => 45,78,36,24,67,8,42,27 enter
		// split "," => String[]
		// 숫자로 변환하여 => ArrayList<Integer>
		// 합계 출력
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자 입력 => ");
		String str = scan.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (String s : str.split(",")) {
			list.add(Integer.parseInt(s));
			sum += Integer.parseInt(s);
		}
		
		System.out.println(list);
		System.out.println(sum);
		
	}

}
