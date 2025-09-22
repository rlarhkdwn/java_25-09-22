package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordController {

	private Map<String, String> word;
	
	public WordController () {
		word = new HashMap<>();
		word.put("apple", "사과");
		word.put("banana", "바나나");
		word.put("orange", "오렌지");
		word.put("pear", "배");
		word.put("kiwi", "키위");
	}
	
	public void printMenu() {
		System.out.println("=====단어장=====");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 출력");
		System.out.println("5. 단어 삭제");
		System.out.println("6. 종료");
	}
	
	public void put(Scanner scan) {
		System.out.print("단어 => ");
		String key = scan.nextLine();
		System.out.print("뜻 => ");
		String value = scan.nextLine();
		word.put(key, value);
		System.out.println("등록되었습니다.");
	}
	
	public void search(Scanner scan) {
		System.out.print("검색할 단어를 입력하세요 => ");
		String key = scan.nextLine();
		if (word.get(key) == null) {
			System.out.println("등록되지 않은 단어입니다.");
			return;
		}
		System.out.println(key + ":" + word.get(key));
	}
	
	public void modify(Scanner scan) {
		System.out.print("수정할 단어를 입력하세요 => ");
		String key = scan.nextLine();
		if (word.get(key) == null) {
			System.out.println("등록되지 않은 단어입니다.");
			return;
		}
		System.out.print("새로운 뜻을 입력하세요 => ");
		String value = scan.nextLine();
		word.put(key, value);
		System.out.println("수정되었습니다.");
	}
	
	public void print() {
		int idx = 1;
		for (String key : word.keySet()) {
			System.out.println(idx++ + ". " + key + ":" + word.get(key));
		}
	}
	
	public void remove(Scanner scan) {
		System.out.print("삭제할 단어를 입력하세요 => ");
		String key = scan.nextLine();
		if (word.get(key) == null) {
			System.out.println("등록되지 않은 단어입니다.");
			return;
		}
		word.remove(key);
		System.out.println("삭제되었습니다.");
	}
}
