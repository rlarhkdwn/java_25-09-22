package day10;

public class Product {
	protected String name;
	protected int price;
	
	// 생성자
	public Product() {}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// print
	public void print() {
		System.out.printf("상품명 : %s, 가격 : %d\n", name, price);
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}	
}