package day08;

public class Class03 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setName("카니발");
		c1.setColor("검정");
		c1.setYear(2025);
		
		System.out.println(c1.toString());
		c1.power();
		c1.print();
		
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.power();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.power();
		c1.print();
		
		Car c2 = new Car();
		System.out.println(c2);
		c2.power();
		c2.print();
		for (int i = 0; i < 6; i++) {
			c2.speedUp();	
		}
		c2.power();
		c2.print();
		
		for (int i = 0; i < 6; i++) {
			c2.speedDown();	
		}
		c2.power();
		c2.print();
		
		Car c3 = new Car("소나타", "흰색", 2020);
		System.out.println(c3); // toString 호출은 .toString() 안써도 호출(출력시)
		
	}

}

class Car {
	// 멤버변수 : naem, color, year, power, speed
	private String name;
	private String color;
	private int year;
	private boolean power;
	private int speed;
	
	// 생성자 위치 - 멤버변수 아래, 메서드 위
	// 객체를 생성할 때 초기값을 지정해주는 역할
	// 기본생성자 : 컴파일러가 컴파일 시 자동으로 제공(생성자가 존재하면 주지 않음)
	// - object = null, 숫자 = 0, boolean = false
	// 생성자는 여러개 생성 가능 (생성자 오버로딩)
	// 생성자 오버로딩 조건 : 매개변수의 개수가 다르거나, 타입이 달라야함
	// 생성자를 사용자가 생성하면 기본 생성자는 사라짐.
	// 생성자를 만들때 꼭 기본 생성자와 같이 생성함
	// public 클래스명(매개변수) {
	// 		멤버변수 set
	// }
	// 생성자는 리턴타입이 없는 메서드와 같은 형태
	
	// 기본생성자
	public Car() {}
	
	// 매개변수가 있는 생성자
	public Car(String name, String color, int year) {
		this.name = name;
		this.color = color;
		this.year = year;
	}
	
	// 메서드 => public
	// 시동 켜기 / 시동 끄기
	// 꺼짐 => 켜짐 / 켜짐 => 꺼짐
	public void power() {
		if (speed > 0) {
			System.out.println("운행 중 시동을 끌 수 없습니다.\n정지 후 시동을 꺼주세요.");
		}
		else {
			this.power = !this.power;	
		}
	}
	
	// power, speed 상태 print()
	public void print() {
		System.out.printf("power: %s, speed: %d\n", this.power ? "ON" : "OFF", this.speed);
	}
	
	private void powerFalsePrint() {
		System.out.println("시동이 꺼져있습니다. \n시동을 먼저 켜주세요.");
	}
	
	// speedUP(엑셀 밟기)
	public void speedUp() {
		if (power) {
			speed += 20;
			speed = Math.min(speed, 100);
			print();
		}
		else {
			powerFalsePrint();
		}
	}
	
	// spedDown(브레이크 밟기)
	public void speedDown() {
		if (power) {
			speed -= 20;
			speed = Math.max(speed, 0);
			print();
		}
		else {
			powerFalsePrint();
		}
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isPower() {
		return this.power;
	}
//	public void setPower(boolean power) {
//		this.power = power;
//	}
	public int getSpeed() {
		return this.speed;
	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
	public String toString() {
		return String.format("(name: %s, color: %s, year: %d, power: %b, speed: %d\n)", 
                this.name, this.color, this.year, this.power, this.speed);
	}
}