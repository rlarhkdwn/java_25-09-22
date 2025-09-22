package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// Prpduct class : name, price
		// Order class : product 상속 수량(count), 금액(total)
		// 주문 출력(하나의 주문에 대한 출력)
		// -- menu -- 
		// 1. 메뉴보기(전체메뉴출력)
		// 2. 주문하기 => 메뉴, 수량 받기
		// 3. 주문내역출력(영수증)
		// 4. 종료(n)
		
		Scanner scan = new Scanner(System.in);
		
		ProductMain pm = new ProductMain();
		
		Product[] products = new Product[5];
		products[0] = new Product("김밥", 3000);
		products[1] = new Product("라면", 3500);
		products[2] = new Product("라볶이", 5000);
		products[3] = new Product("돈까스", 7000);
		products[4] = new Product("잔치국수", 6000);
		
		Order[] orders = new Order[100];
		int orderCount = 0;
		
		while (true) {
			System.out.println("1. 메뉴 선택, 2. 장바구니 3. 결제하기, 4. 나가기");
			System.out.println("입력 => ");
			String choice = scan.nextLine();
			
			if (!pm.allDisit(choice)) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			switch (choice) {
			case "1":
				for(int i = 0; i < products.length; i++) {
					System.out.printf("%d. ", i + 1);
					products[i].print();
				}
				
				System.out.print("메뉴번호를 선택해주세요 => ");
				String num = scan.nextLine();
			
				if (!pm.allDisit(num)) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				System.out.print("수량을 선택해주세요 => ");
				String cnt = scan.nextLine();
			
				if (!pm.allDisit(cnt)) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				Order order = new Order(products[Integer.parseInt(num) - 1].getName(), products[Integer.parseInt(num) - 1].getPrice(), Integer.parseInt(cnt));
				orders[orderCount] = order;
				orderCount++;
				break;
				
			case "2":
				int total = 0;
				if (orderCount > 0) {
					System.out.println("=====장바구니=====");
					total = 0;
					for (int i = 0; i < orderCount; i++) {
						orders[i].print();
						total += orders[i].getTotal();
					}
					System.out.println("합계: " + total);
				}
				else {
					System.out.println("선택한 메뉴가 없습니다.");
				}
				break;
			case "3":
				if (orderCount > 0) {
					System.out.println("결제되었습니다.");
					System.out.println("=====영수증=====");
					total = 0;
					for (int i = 0; i < orderCount; i++) {
						orders[i].print();
						total += orders[i].getTotal();
					}
					System.out.println("합계: " + total);
				}
				else {
					System.out.println("선택한 메뉴가 없습니다.");
				}
				break;
			case "4":
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못 선택하셨습니다.");
			}
		}
		
	}
	
	public boolean allDisit(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}