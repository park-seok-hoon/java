package day17;

public class ThreadEx1 {
	//스레드
	public static void main(String[] args) {
		//싱글 스레드로 - 출력후 + 출력
		//메인 스레드를 이용한 경우,앞에 있는 작업이 끝나야 뒤에 작업이 실행됨
		for(int i=0; i<1000; i++)
		{
			System.out.print("-");
			
		}
		for(int i=0; i<1000; i++)
		{
			System.out.print("+");
		}
		System.out.println();
		
		//멀티 쓰레드로 쓰레드1은 - 출력, 쓰레드2는 + 출력
		Thread1 t1 = new Thread1(); 
		t1.start();
		
		//Thread2 tmp = new Thread2();
		//Thread t2 =new Thread(tmp);
		
		Thread t2 = new Thread(new Thread2()); 
		t2.start();
		//Thread 생성자 안에 Thread2() 생성자를 넣음
	}

}
class Thread1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++){
			System.out.print("-");
		}
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<1000; i++)
		{
			System.out.print("+");
		}
	}
	
	
	
}