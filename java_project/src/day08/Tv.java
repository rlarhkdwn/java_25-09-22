package day08;

public class Tv {
	// 멤버변수 : brand, power, ch, vol
	private String brand;
	private boolean power;
	private int ch;
	private int chMax;
	private int vol;
	private int volMax;
	// 선호채널 배열
	private int[] favor = new int[5];
	private int favorCount;
	
	// 기본생성자, brand만 받는 생성자
	public Tv() {
		this.chMax = 20;
		this.vol = 5;
		this.volMax = 10;
	}
	public Tv(String brand) {
		this();
		this.brand = brand;
	}
	public Tv(String brand, int chMax, int volMax) {
		this(brand);
		this.chMax = chMax;
		this.volMax = volMax;
	}
	
	// pick() : 선호채널 등록
	public void pick() {
		// favorCount는 favor의 번지 역할을 하는 변수
		if (isContain(this.ch)) {
			System.out.println("이미 등록된 채널입니다.");
			return;
		}
		if (this.favorCount == this.favor.length) {
			pop(1);
		}
		this.favor[this.favorCount] = this.ch;
		this.favorCount++;
		System.out.println(ch + "번을 선호채널로 등록합니다.");
	}

	// pop() : 선호채널 삭제
	public void pop(int idx) {
		idx--;
		if (idx >= 0 && idx < this.favorCount) {
			for (int i = idx; i < this.favor.length - 1; i++) {
				this.favor[i] = this.favor[i + 1];
			}
			this.favorCount--;
		} 
		else {
			System.out.println("해당 채널이 없습니다.");
		}
	}
	
	// 선호채널 중복 확인
	public boolean isContain(int num) {
		for (int i = 0; i < this.favorCount; i++) {
			if (this.favor[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	// favorPrint() : 선호채널 출력
	public void favorPrint() {
		System.out.println("===선호채널 목록===");
		for (int i = 0; i < this.favorCount; i++) {
			System.out.println(i + 1 + ". " + this.favor[i]);
		}
	}
	
	
	// 메서드
	// power()
	// chUp(), chDown() (0~20) 순환 구조
	// volUp(), volDown() (0~10) 상한 존재, 1씩 증가, 감소
	// 0일때 음소거라고 출력
	
	// power
	public void power() {
		this.power = !this.power;
		System.out.println("power: " + this.power);
	}
	public void printFalsePower() {
		System.out.println("전원이 꺼져있습니다.");
	}
	
	
	// ch
	public void chUp() {
		if (power) {
			if (this.ch == this.chMax) {
				this.ch = 0;
			}
			else {
				this.ch++;
			}
			System.out.println("ch: " + this.ch);
		}
		else {
			printFalsePower();
		}
	}
	
	public void chDown() {
		if (power) {
			if (this.ch == 0) {
				this.ch = this.chMax;
			}
			else {
				this.ch--;
			}
			System.out.println("ch: " + this.ch);
		}
		else {
			printFalsePower();
		}
		
	}
	
	
	// vol
	public void volUp() {
		if (power) {
			this.vol++;
			this.vol = Math.min(this.vol, this.volMax);
			System.out.println("vol: " + this.vol);
		}
		else {
			printFalsePower();
		}
	}
	
	public void volDown() {
		if (power) {
			this.vol--;
			this.vol = Math.max(this.vol, 0);
			if (this.vol > 0) {
				System.out.println("vol: " + this.vol);
			}
			else {
				System.out.println("vol: 음소거");
			}
		}
		else {
			printFalsePower();
		}
	}
	
		
	// getter / setter
	public String getBrand() {
		return brand;
	}
	public void setBrend(String brand) {
		this.brand = brand;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	// toString
	public String toString() {
		return String.format("brand: %s, power: %b, ch: %d, chMax: %d, vol: %d, volMax: %d", this.brand, this.power, this.ch, this.chMax, this.vol, this.volMax);
	}
}