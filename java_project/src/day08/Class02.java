package day08;

public class Class02 {

	public static void main(String[] args) {
	
		Test t = new Test();
//		t.x = 1;
//		t.y = 2;
		t.setX(10);
		t.setY(20);
		System.out.println("(" + t.getX() + ", " + t.getY() + ")");
		// toString 호출
		System.out.println(t.toString());
	}

}

class Test {
	// 패키지가 다르면 같은 이름의 클래스 사용 가능
	private int x;
	private int y;
	
	// toString()
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}