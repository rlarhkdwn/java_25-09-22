package day04;

public class String01 {

	public static void main(String[] args) {
		// String class : 문자열을 다루기 위한 클래스 => 기본 자료형x
		// class : 여러가지 기능을 담고 있는 정의서
		// 클래스타입 객체명 = new 클래스명(생성자)
		// String str = new String();
		
		String str = "abc c def c"; // 일반 자료형처럼 사용이 가능
		System.out.println(str);
		
		// length : 전체 클자수 (글자의 총길이)
		System.out.println("===lengtg===");
		System.out.println(str.length());
		
		// charAt(Index) : index 번지에 있는 문자를 바노한 char
		System.out.println("===charAt===");
		System.out.println(str.charAt(2));
		
		// substring() : 문자열 추출
		System.out.println("===substring===");
		System.out.println(str.substring(4)); // 4번지부터 끝까지
		System.out.println(str.substring(0, 3)); // 시작번지는 포함 / 마지막 번지는 미포함
		
		// equals() : 두 문자가 같은지 비교(대소문자 구분)
		// 같으면 true / 다르면 false
		// 참조 자료형은 == 로 비교하면 주소가 같은지 비교
		System.out.println("===equals===");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("ABC"));
		System.out.println("abc".equals(str));
		
		// indexOf() : 문자의 위치(index)를 찾아주는 기능
		// 한 문자열에 같은 단어가 여러개면 처음 일치하는 값만 리턴
		// 찾는 문자가 없으면 -1 리턴
		System.out.println("===indexOf===");
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("c", 3)); // 탐색 시작 위치
		System.out.println(str.indexOf("ab"));
		System.out.println(str.indexOf(" "));
		System.out.println(str.indexOf("-"));
		System.out.println(str.lastIndexOf("c"));
		
		// email에서 id만 추출 출력
		String email = "abc123@naver.com";
		System.out.println(email.substring(0, email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@") + 1));
		
		// str1.compareTo(str2) : str1과 str2를 비교하여 
		// 사전순으로 앞이면 -, 같으면 0, 뒤면 + 값으로 리턴
		// 문자 정렬시 사용
		System.out.println("===compareTo===");
		System.out.println("a".compareTo("c"));
		System.out.println("a".compareTo("a"));
		
		// contains() : 해당 문자를 포함하고 있는지 체크
		System.out.println("===contains===");
		String file = "Hellojava.html";
		System.out.println(file.contains("java"));
		System.out.println(file.contains("css"));
		
		// concat() : 이어붙이기 (+ 연결연산자와 같은 의미)
		System.out.println("===concat===");
		System.out.println("abc".concat(file));
		System.out.println("abc" + file);
	
	}

}