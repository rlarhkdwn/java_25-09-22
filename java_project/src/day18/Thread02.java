package day18;

public class Thread02 {

	public static void main(String[] args) {
		// Runnalbe 구현하는 방법
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("main Thread start!!");
		
		// interface로 구현한 스레드 객체는 Thread의 객체가 없어서 실행이 안됨
		// Thread 객체를 생성해서 넣어줘야 함
		MyThread th = new MyThread();
		Thread t = new Thread(th);
		t.start();
		
		// join() : 다른 스레드가 실행을 마칠 때까지 현재 스레드를 대기 상태로 만듦
		// sleep() : 일정 시간동안 스레드를 중지하고 대기상태로 만듦, 단위는 밀리 세컨드 ms
		try {
			t.join();
			Thread.sleep(1000); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		
		System.out.println("main Thread end!!");

	}

}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		// 1부터 2000까지 반복 출력하는 구문 실행
		for (int i = 0; i < 2000; i++) {
			System.out.println(i + ". thread > " + Thread.currentThread().getName());
		}
		
		System.out.println(Thread.currentThread().getName() + "end~!!");
		
	}
	
}