package MultiThreading;



class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Started" +Thread.currentThread().getName());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("Thread Ended" +Thread.currentThread().getName());
	}
	
}
public class ThreadSleep {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable(),"t1");
		Thread t2 = new Thread(new MyRunnable(),"t2");
		Thread t3 = new Thread(new MyRunnable(),"t3");
		t1.start();
		
		//start second Thread wait for 2 millisecond or thread is dead
		try{
			t1.join(2000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		t2.start();
		
		//start t3 only when t1 ends
		try{
		t1.join();	
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		t3.start();
		
		// let all thread finish execution before main thread ends
		try{
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		System.out.println("All thread are dead, Exiting Main Thread");
	}

}
