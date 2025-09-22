package day10;

public class Order extends Product {
	private int count;
	private int total = 0;
	
	public Order() {
		super();
	}
	
	public Order(String name, int price, int count) {
		super(name, price);
		this.count = count;
		this.total += price * count;
	}
	
	@Override
	public void print() {
		System.out.printf("상품명: %s, 가격: %d, 수량: %d, 합계: %d\n", name, price, count, total);
	}
	
	public void printTotal() {
		System.out.printf("합계: %d\n", total);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}
}