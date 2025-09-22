package day16;

public class AnonymousClass01 {

	public static void main(String[] args) {
		// 이름이 없는 클래스
		// 나중에 다시 객체를 생성할 일이 없는 것을 의미
		// 한번 쓰고 버려지는 객체 (일회용 클래스)
		//
		// 인터페이스를 사용하여 객체를 생성할 경우
		// 인터페이스의 구현의 메서드가 적고,
		// 인터페이스의 구현 외의 다른 구현이 없고,
		// 해당 객체를 한번만 사용하는 경우
		// 메서드의 매개변수로 객체가 사용되는 케이스에서 주로 사용
		
		// 일반 클래스를 생성하여 객체를 호출한 경우
//		Tv t = new Tv();
//		t.turnOn();
//		t.turnOff();

		AnonymousClass01 ac = new AnonymousClass01();
//		ac.tv(t);
		
		// 익명클래스로 작업하는 경우
		ac.tv(new Power() {

			@Override
			public void turnOn() {
				System.out.println("익명클래스 전원이 켜집니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("익명클래스 전원이 꺼집니다.");
				
			}
			
		});
		
	}

	public void tv(Power p) {
		p.turnOn();
		System.out.println("tv가 정상 작동중...");
		p.turnOff();
	}
}

interface Power {
	void turnOn();
	void turnOff();
}