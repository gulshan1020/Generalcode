package MultiThreading;

public class ThreadA extends Thread {
	public void run(){
		for(int i=0;i<5;i++) {
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub t1r
		Thread w = Thread.currentThread();
		System.out.println(w.getName());
		ThreadA t1 = new ThreadA();
		ThreadA t2 = new ThreadA();
		ThreadA t3 = new ThreadA();
		
		t1.start();
		try{
		t1.join();	
		}catch(Exception e){System.out.println(e);}
		t2.start();
		try{
			t2.join();	
			}catch(Exception e){System.out.println(e);}
		
		t3.start();

	}

}
