package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		// Map : 값을 쌍으로 저장 key / value
		// key 는 중복 불가능, value 는 중복 가능
		// HashMap 을 가장 많이 사용
		Map<String, Integer> map = new HashMap<>();
		
		// put() 으로 추가
		map.put("apple", 2000);
		map.put("banana", 2500);
		map.put("orange", 3000);
		map.put("apple", 2500); // 덮어쓰기
		map.put("peach", 3000);
		map.put("kiwi", 4000);
		
		System.out.println(map);
		
		// list.get(i) / map.get(key) => value 리턴
		System.out.println(map.get("banana"));
		
		// keySet() : 키만 set으로 리턴
		// values() : value만 리턴
		System.out.println(map.keySet());
		System.out.println(map.values());

		System.out.println(map.entrySet());
		
		// map 출력
		// 합계 출력
		int sum = 0;
		for (String s : map.keySet()) {
			int value = map.get(s);
			sum += value;
			System.out.println(s + ":" + map.get(s));
		}
		System.out.println("합계: " + sum);
		
		// iterator
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		// remove(object)
		System.out.println(map.remove("apple")); // 리턴값 value
		System.out.println(map.remove("banana", 2500)); // 리턴값 boolean
		System.out.println(map.remove("apple")); // null
		
	}

}
