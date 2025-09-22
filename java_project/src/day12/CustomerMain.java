package day12;

public class CustomerMain {

	public static void main(String[] args) {
		// 백화점 고객
		// 일반고객 / Gold고객(할인) / VIP고객(할인)
		//
		// 고객 => Customer
		// 멤버변수
		// 고객ID : int customerID
		// 고객이름 : String customerName
		// 고객등급 : String customerGrade
		// 보너스포인트 : int bonusPoint
		// 적립비율 : double bonusRatio
		//
		// 기본 등급 : Silver
		// 기본 적립 : 0.01
		//
		// 메서드
		// 1. 보너스 적립 계산 메서드 (calcPrice)
		// 구매금액의 적립 보너스를 계산 => 누적
		// 보너스 적립, 할인여부도 체크해서 구매 금액을 리턴
		// 
		// 2. 출력 메서드
		// 홍길동 님은 VIP고객이며, 현재 보너스포인트는 1000점입니다.
		// 전담 상담사는 짱구이고, 번호는 1111입니다.
		//
		// 등급
		// Silver(기본) / Gold / VIP
		// Silver 등급
		// 제품을 구입할 때 0% 할인 / 보너스 포인트 1% 적립
		// Gold 등급
		// 제품을 구입할 때 10% 할인 / 보너스 포인트 2% 적립
		// VIP 등급
		// 제품을 구입할 때 10% 할인 / 보너스 포인트 3% 적립
		// 전담 상담사를 멤버변수에 추가(agentName, agentNum)
		//
		// Customer => Silver
		//
		// GoldCustomer extends Customer {
		//  	기본 메서드 오버라이딩 해서 사용
		// }
		//
		// VIPCustomer extends Customer {
		// 		기본메서드 + 추가메서드
		// }
		
		Agent a1 = new Agent("짱구", "1111");
		Agent a2 = new Agent("철수", "2222");
		Agent a3 = new Agent("유리", "3333");
		Agent a4 = new Agent("맹구", "4444");
		Agent a5 = new Agent("훈이", "5555");
		
		Customer[] customerList = new Customer[5];
		customerList[0] = new Customer("김길동");
		customerList[1] = new Customer("이길동", "Silver");
		customerList[2] = new Customer("박길동", "Gold");
		customerList[3] = new VIPCustomer("최길동", "VIP", a1);
		customerList[4] = new VIPCustomer("홍길동", "VIP", a2);
		
		int price;
		System.out.println("==================================");
		price = customerList[0].calcPrice(10000);
		System.out.println("결제금액: " + price);
		customerList[0].print();
		
		System.out.println("==================================");
		price = customerList[0].calcPrice(20000);
		System.out.println("결제금액: " + price);
		customerList[0].print();
		
		System.out.println("==================================");
		price = customerList[1].calcPrice(10000);
		System.out.println("결제금액: " + price);
		customerList[1].print();

		System.out.println("==================================");
		price = customerList[1].calcPrice(20000);
		System.out.println("결제금액: " + price);
		customerList[1].print();
		
		System.out.println("==================================");
		price = customerList[2].calcPrice(10000);
		System.out.println("결제금액: " + price);
		customerList[2].print();
		
		System.out.println("==================================");
		price = customerList[2].calcPrice(20000);
		System.out.println("결제금액: " + price);
		customerList[2].print();

		System.out.println("==================================");
		price = customerList[3].calcPrice(10000);
		System.out.println("결제금액: " + price);
		customerList[3].print();

		System.out.println("==================================");
		price = customerList[3].calcPrice(20000);
		System.out.println("결제금액: " + price);
		customerList[3].print();

		System.out.println("==================================");
		price = customerList[4].calcPrice(10000);
		System.out.println("결제금액: " + price);
		customerList[4].print();

		System.out.println("==================================");
		price = customerList[4].calcPrice(20000);
		System.out.println("결제금액: " + price);
		customerList[4].print();
		
		
		// 다운 케스팅 사용 예시
		// agentNum = 1111 (짱구) 퇴사 => 1003 (철이)
		System.out.println("==================================");
		Agent a6 = new Agent("철이", "1003");
		for (int i = 0; i < customerList.length; i++) {
			if (customerList[i] instanceof VIPCustomer && ((VIPCustomer)customerList[i]).getAgent().getAgentNum() == a1.getAgentNum()) {
				((VIPCustomer)customerList[i]).setAgent(a6);
			}
		}
		
		System.out.println("==================================");
		price = customerList[3].calcPrice(10000);
		System.out.println("결제금액: " + price);
		customerList[3].print();

		System.out.println("==================================");
		price = customerList[3].calcPrice(20000);
		System.out.println("결제금액: " + price);
		customerList[3].print();
		
	}

}
