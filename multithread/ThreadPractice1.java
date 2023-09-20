package multithread;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("ID      : "+i);
		}
	}
}
public class ThreadPractice1 {
	public static void main(String[] args) {
		
		MyThread1 ob1=new MyThread1();
		ob1.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Integer : "+i);
		}
		
		
	}

}
