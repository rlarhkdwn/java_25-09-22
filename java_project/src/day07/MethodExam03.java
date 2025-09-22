package day07;

public class MethodExam03 {
	
	// 1. 배열을 매개변수로 받아 무작위수를 채워주는 메서드
	public void setRandom(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 45) + 1;
			if (!isDuplicated(arr, num, i)) {
				arr[i] = num;
			}
			else {
				i--;
			}
		}
	}
	
	// 1-1. 중복 확인 메서드
	public boolean isDuplicated(int[] arr, int num, int lastIndex) {
		for (int i = 0; i < lastIndex; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	// 2. 배열을 출력하는 메서드 (0 0 0 0 0 0 [0])
	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 6) {
				System.out.print("[" + arr[i] + "]");
			}
			else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	
	// 정렬 (idx 5까지, 보너스번호 제외)
	public void sort(int[] arr) {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	// 3. 당첨 확인 메서드
	public int getRank(int[] user, int[] lotto) {
		int matchCount = 0;
		boolean bonus = false;
		
		for (int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(i == lotto.length - 1 && lotto[i] == user[j]) { // 보너스번호 확인
					bonus = true;
				}
				else {
					if (lotto[i] == user[j]) { // 일치하는 당첨번호 개수 확인
						matchCount++;
					}
				}
				
			}
		}
		
		switch (matchCount) {
		case 0: case 1: case 2: return 0;
		case 3: return 5;
		case 4: return 4;
		case 5: return bonus ? 2 : 3;
		case 6: return 1;
		default: return -1;
		}
	}
	
	public static void main(String[] args) {
		// 로또 번호 생성
		// user 번호 6개
		// 1~45 까지 중 6개 번호를 무작위 생성 (자동)
		// 당첨 번호 7개(보너스 번호 +1)
		//
		// 당첨번호와 유저 번호를 비교하여 등수 추출
		// 1등 : 6개 번호 모두 일치(보너스 제외)
		// 2등 : 5개 번호 일치 + 보너스 일치
		// 3등 : 5개 번호 일치
		// 4등 : 4개 번호 일치
		// 5등 : 3개 번호 일치
		// 꽝 : 나머지
		
		MethodExam03 me3 = new MethodExam03();
		int[] user = new int[6]; // 사용자번호 배열
		int[] lotto = new int[7]; // 당첨번호 배열
		int cnt = 0;
		while (true) {
			me3.setRandom(lotto);
			me3.setRandom(user);
			
//			me3.sort(lotto);
//			System.out.print("lotto: ");
//			me3.printArray(lotto);
//			
//			me3.sort(user);
//			System.out.print("user: ");
//			me3.printArray(user);
			
			int rank = me3.getRank(user, lotto);
//			if (rank == 0) {
//				System.out.println("결과: 꽝입니다.");
//			}
//			else if (rank >= 1 && rank <= 5) {
//				System.out.printf("결과: %d등입니다", rank);
//			}
//			else {
//				System.out.println("오류!!!");
//			}
			
			cnt++;
			if (rank == 1) {
				System.out.println("시도 횟수: " + cnt);
				break;
			}
		}
	}
}