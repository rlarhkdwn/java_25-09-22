package day11;

public class Interface01 {

	public static void main(String[] args) {
		// interface (인터페이스)
		// 추상메서드와 상수(final)로만 이루어진 것
		// 추상클래스 / 인터페이스 : 추상 메서드를 포함하고 있기 때문에
		// 반드시 구현해야만 객체를 생성할 수 있음.
		// 
		// 인터페이스 interface
		// 기능 요약서 : 메뉴얼 화
		// 자체적으로 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		// 구현 키워드 : implements
		// 인터페이스는 멤버변수가 없음
		// 이 부분을 염두에 두고 메서드 정리를 해야함
		//
		// 상속 : 다중상속 불가능 (단일상속 원칙)
		// 구현 : 다중 구현이 가능
		// 상속 + 구현 동시에 가능
		Tv t = new Tv();
		t.volUp();
		t.volDOwn();
		t.turnOff();
		t.turnOn();
		
	}

}

interface Power {
	abstract void turnOn();
	void turnOff(); // abstract 생략 가능
}

interface Remocon {
	void volUp();
	void volDOwn();
}

// 상속과 구현을 동시에 하는경우
// class Tv2 extends A implements B, C {}

class Tv implements Power, Remocon {
	private int vol;
	private boolean power;
	
	@Override
	public void turnOn() {
		power = true;
		System.out.println("TV가 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다.");
		
	}

	@Override
	public void volUp() {
		vol++;
		System.out.println("vol: " + vol);
		
	}

	@Override
	public void volDOwn() {
		vol--;
		System.out.println("vol: " + vol);
	}
	
}