package day08;

public class Card {
	// 숫자 : 1(A)~10, 11(J), 12(Q), 13(K)
	// 모양 : ♥, ◆, ♣, ♠
	// ex) ♥1, ♣J, *13 => ♥13, $20 => ♥1  
	// 해당 범위에 벗어나는 숫자는 => 1
	// 해당 범위에 벗어나는 모양은 => ♥
	//
	// 멤버변수 : 숫자(num), 모양(shape)
	// toString
	// 생성자 => 기본생성자만 => ♥A
	// print() 
	// 	=> 1(A), J(11), Q(12), K(13)
	
	private int num;
	private int shape;
	private String[] num2str = {"", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] shape2str = {"♥", "◆", "♣", "♠"};
	
	// 생성자
	public Card() {
		this.num = 1;
		this.shape = 0; // 0: ♥, 1: ◆, 2: ♣, 3: ♠
	}
	
	// print
	public void print() {
		System.out.print(cvtNum2str(this.num) + cvtShape2str(this.shape));
	}
	
	public void println() {
		System.out.println(cvtNum2str(this.num) + cvtShape2str(this.shape));
	}
	

	// 변환
	public String cvtNum2str(int num) {
		return this.num2str[this.num];
	}
	public String cvtShape2str(int num) {
		return this.shape2str[this.shape];
	}
	
	
	// getter / setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if (num >= 1 && num <= 13) {
			this.num = num;	
		}
		else {
			this.num = 1;
		}
	}
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		if (shape >= 0 && shape <= 3) {
			this.shape = shape;	
		}
		else {
			this.shape = 0;
		}
	}
	
	
	// toString
	@Override
	public String toString() {
		return String.format("num: %s, shape: %s", cvtNum2str(this.num), cvtNum2str(this.shape));
	}
}