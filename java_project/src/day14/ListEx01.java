package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// 두 배열을 합쳐 하나의 list로 생성
		// 정렬 해서 출력
		
		String[] arr1 = {"a", "t", "y", "s", "d"};
		String[] arr2 = {"b", "u", "c", "z", "g"};		

		List<String> list = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>(Arrays.asList(arr1)); // 배열의 값을 복사해서 리스트로 생성
		List<String> list3 = new ArrayList<>(Arrays.asList(arr1));
		list = Arrays.asList(arr1); // 배열의 값을 연결해서 리스트로 가져오기
		System.out.println(list);
		arr1[2] = "0";
		System.out.println(list);
		
		
		// addAll(list) : 모든 요소 추가
		list2.addAll(list3);
		System.out.println(list2);
		
//		for (int i = 0; i < arr1.length; i++) {
//			list.add(arr1[i]);
//			list.add(arr2[i]);
//		}
//		
//		Collections.sort(list);
//		
//		System.out.println(list);

	}

}
