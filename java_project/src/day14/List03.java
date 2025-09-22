package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List03 {

	public static void main(String[] args) {
		// 과일 5개 저장하고 list출력
		ArrayList<String> list = new ArrayList<>();
		list.add("사과");
		list.add("오렌지");
		list.add("바나나");
		list.add("귤");
		list.add("감");
		
		// 일반 for 문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("======================");
		
		// 향상된 for 문
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("======================");
		
		// Iterator
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("======================");
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
