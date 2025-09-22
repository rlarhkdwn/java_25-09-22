package day08;

public class CardPack {
	// Card 클래스를 52장 묶은 pack
	// ♥A~♥K, ◆A~◆K, ♣A~♣K, ♠A~♠K
	// 총 카드수 52장의 한 묶음 (배열)
	// 멤버변수 : 총 52장의 Card 담을수 있는 배열
	//
	// 메서드()
	// 카드 출력 (Card => print())
	// 카드 섞기
	// 카드 한 장 뽑기
	// 카드 초기화
	//
	// 생성자
	
	private Card[] pack = new Card[52];
	private int top;
	
	// 생성자 CardPack() => 52장의 카드가 생겨서 만들어져야함
	public CardPack() {
		int idx = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 13; j++) {
				Card c = new Card();
				c.setShape(i);
				c.setNum(j);
				pack[idx++] = c;
			}
		}
		this.top = this.pack.length - 1;
	}
	

	// 카드 출력
	public void print() {
		int idx = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 13; j++) {
				pack[idx++].print();
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	
	// 카드 섞기
	public void shuffle() {
		for (int i = 0; i < pack.length; i++) {
			int j = (int)(Math.random() * pack.length);
			Card temp = pack[i];
			pack[i] = pack[j];
			pack[j] = temp;
		}
	}

	
	// 카드 한 장 뽑기
	public Card draw() {
		return isEmpty() ? null : this.pack[top--];
	}
	
	
	// 카드 초기화
	public void initCard() {
		int idx = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 13; j++) {
				Card c = new Card();
				c.setShape(i);
				c.setNum(j);
				pack[idx++] = c;
			}
		}
		this.top = this.pack.length - 1;
	}
	
	
	public boolean isEmpty() {
		return top <= -1;
	}
	
	// getter / setter
	public Card[] getPack() {
		return this.pack;
	}


	public void setPack(Card[] pack) {
		this.pack = pack;
	}


	public int getTop() {
		return this.top;
	}


	public void setTop(int top) {
		this.top = top;
	}
}