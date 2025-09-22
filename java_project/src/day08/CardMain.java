package day08;

public class CardMain {

	public static void main(String[] args) {
		Card c = new Card();
//		System.out.println(c);
//		c.println();
//		
//		c.setNum(14);
//		c.setShape(7);
//		c.println();
//	
//		c.setNum(2);
//		c.setShape(8);
//		c.println();
//	
//		c.setNum(17);
//		c.setShape(3);
//		c.println();
//		
//		c.setNum(13);
//		c.setShape(3);
//		c.println();
//		
//		// shape = 4개
//		// 숫자 = 13개
//		for (int i = 0; i <= 3; i++) {
//			for (int j = 1; j <= 13; j++) {
//				c.setShape(i);
//				c.setNum(j);
//				c.print();
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("========================");
		
		CardPack cp = new CardPack();
//		cp.print();
//		cp.draw().println();
//		cp.draw().println();
//		cp.draw().println();
//		cp.initCard();
//		cp.shuffle();
//		cp.draw().println();
//		cp.draw().println();
//		cp.draw().println();
//		cp.initCard();
//		cp.shuffle();
//		cp.print();	
		
		// 카드 Test
		System.out.println("딜러가 카드를 섞습니다.");
		cp.shuffle();
		cp.print();
		
		// player 4명
		System.out.println("딜러가 카드를 나누고 있습니다.");
		Card player1 = cp.draw();
		Card player2 = cp.draw();
		Card player3 = cp.draw();
		Card player4 = cp.draw();
		
		System.out.println("각 플레이어 Card open");
		System.out.print("player1 => ");
		player1.println();
		System.out.print("player2 => ");
		player2.println();
		System.out.print("player3 => ");
		player3.println();
		System.out.print("player4 => ");
		player4.println();
		
		cp.initCard();
		
		
		
		
		
		
		
		
		
		
	}
}