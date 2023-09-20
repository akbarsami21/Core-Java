package multithread;

class Mythread2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("ID      : "+i);
		}
	}
	
}
public class ThreadPractice2 {
	public static void main(String[] args) {
		//two way u can create object
		
		//type:1
	 /* Mythread2 ob1=new Mythread2();
		Thread ob2= new Thread(ob1);
		ob2.start(); */
		
		//type:2
		Thread ob1=new Thread(new Mythread2());
		ob1.start();
		

		for(int i=1;i<=5;i++) {
			System.out.println("Integer : "+i);
		}
	}

}
