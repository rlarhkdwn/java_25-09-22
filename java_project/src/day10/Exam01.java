package day10;

import java.util.Scanner;

public class Exam01 {

	private Product[] products = new Product[10];
	private int productCount = 0;
	
	public static void main(String[] args) {
		// Product 클래스를 생성 : 상품을 등록할 때 사용하는 클래스
		// 상품명, 가격, ...
		// 상품명과 가격을 출력하는 메서드
		//
		// main에서 Product[10]
		// 스캐너를 통해서 상품을 등록받기
		// 등록한 상품을 출력
		
		Scanner scan = new Scanner(System.in);
		Exam01 e1 = new Exam01();

		while (true) {
			e1.printMenu();
			System.out.print("입력 => ");
			String choice = scan.nextLine();
			
			switch (choice) {
			case "1": e1.menu1(scan, e1); break; // 1. 메뉴 등록
			case "2": e1.menu2(e1); break; // 2. 메뉴 출력
			case "9": System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	// 전체 메뉴 출력
	public void printMenu() {
		System.out.println("=====키오스크=====");
		System.out.println("1. 메뉴 등록");
		System.out.println("2. 메뉴 출력");
		System.out.println("9. 프로그램 종료");
	}
	
	// 1번 메뉴 : 메뉴 등록
	public void menu1(Scanner scan, Exam01 e1) {
		System.out.println("=====메뉴 등록=====");
		System.out.print("메뉴 이름 : ");
		String name = scan.nextLine();
		System.out.print("메뉴 가격 : ");
		int price = scan.nextInt();
		scan.nextLine();
		Product p = new Product(name, price);
		
		if (productCount >= products.length) {
			products = e1.extendArray(products);
		}
		products[productCount] = p;
		productCount++;
	}
	
	// 2번 메뉴 : 메뉴 출력
	public void menu2(Exam01 e1) {
		for (int i = 0; i < e1.productCount; i++) {
			System.out.print(i + 1 + ". ");
			e1.products[i].print();
		}
	}
	
	
	public Product[] extendArray(Product[] arr) {
		Product[] newArr = new Product[arr.length + 5];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		return newArr;
	}
}
