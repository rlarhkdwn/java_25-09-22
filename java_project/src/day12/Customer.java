package day12;

// 고객ID : int customerID
// 고객이름 : String customerName
// 고객등급 : String customerGrade
// 보너스포인트 : int bonusPoint
// 적립비율 : double bonusRatio

public class Customer {
	protected static int customerIDCount = 0;
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	protected double discountRatio;
	
	public Customer(String customerName){
		this.customerGrade = "Silver";
		bonusRatio = Grade.SILVER_BONUS_RATIO;
		discountRatio = Grade.SILVER_DISCOUNT_RATIO;
	}
	
	public Customer(String customerName, String customerGrade){
		customerID = customerIDCount++;
		this.customerName = customerName;
		
		if (customerGrade.equals("Gold")) {
			this.customerGrade = "Gold";
			bonusRatio = Grade.GOLD_BONUS_RATIO;
			discountRatio = Grade.GOLD_DISCOUNT_RATIO;
		} else if (customerGrade.equals("VIP")) {
			this.customerGrade = "VIP";
			bonusRatio = Grade.VIP_BONUS_RATIO;
			discountRatio = Grade.VIP_DISCOUNT_RATIO;
		} else { // Silver
			this.customerGrade = "Silver";
			bonusRatio = Grade.SILVER_BONUS_RATIO;
			discountRatio = Grade.SILVER_DISCOUNT_RATIO;
		}
	}
	
	// 1. 보너스 적립 계산 메서드 (calcPrice)
	// 구매금액의 적립 보너스를 계산 => 누적
	// 보너스 적립, 할인여부도 체크해서 구매 금액을 리턴
	public int calcPrice(int price) {
		int bonusPoint = (int)(price * bonusRatio);
		this.bonusPoint += bonusPoint;
		int discount = (int)(price * discountRatio);
		return price - discount;
	}
	
	// 2. 출력 메서드
	// 홍길동 님은 VIP고객이며, 현재 보너스포인트는 1000점입니다.
	// 전담 상담사는 짱구이고, 번호는 1111입니다.	
	public void print() {
		System.out.printf("회원번호 %d: %s님은 %s고객이며, 현재 보너스 포인트는 %d점입니다.\n", customerID, customerName, customerGrade, bonusPoint);
	}

	public static int getCustomerIDCount() {
		return customerIDCount;
	}

	public static void setCustomerIDCount(int customerIDCount) {
		Customer.customerIDCount = customerIDCount;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public double getDiscountRatio() {
		return discountRatio;
	}

	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}
	

}