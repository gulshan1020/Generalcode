package MultiThreading;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

 class Producer implements Runnable {
	private final Vector sharedQue;
	private final int SIZE;
	public Producer(Vector sharedQue, int size){
		this.sharedQue = sharedQue;
		this.SIZE = size;
	}
	@Override
	public void run() {
		for(int i =0;i < 7;i++) {
			System.out.println("produced" +i);
			try{
				produce(i);
			}catch(InterruptedException ix){
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE,null,ix);
			}
		}
		
		
	}
	
	public void produce(int x) throws InterruptedException {
		//wait if que is full
		while(sharedQue.size() == SIZE) {
			synchronized(sharedQue){
				System.out.println("que is full" + Thread.currentThread().getName() +
						"is waiting , size: " + sharedQue.size());
				sharedQue.wait();
			}
		}
		
		synchronized(sharedQue){
			sharedQue.add(x);
			sharedQue.notify();
		}
		
	}
}
 
 class Consumer implements Runnable {
	 private final Vector sharedQue;
	 private final int SIZE;
	 
	 public Consumer(Vector sharedQue, int size){
		 this.sharedQue = sharedQue;
		 this.SIZE = size;
	 }
	 
	@Override
	public void run() {
		while(true) {
			try{
				System.out.println("consumed  :" + consumed());
				Thread.sleep(50);
			}catch(InterruptedException ii){
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE,null,ii);
			}
		}
		
	}
	
	private int consumed() throws InterruptedException {
		
		// wait if que is empty
		while(sharedQue.isEmpty()) {
			synchronized (sharedQue) {
				System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQue.size());
				sharedQue.wait();
			}
		}
		
		// otherwise consume element and notify
		synchronized (sharedQue) {
			sharedQue.notify();
		return (Integer)sharedQue.remove(0)	;
		}
		
	}
 }

public class ProducerConsumerSolution {

	public static void main(String[] args) {
		Vector sharedQue  = new Vector();
		int size = 4;
		Thread prod = new Thread(new Producer(sharedQue,size),"producer");
		Thread cons = new Thread(new Consumer(sharedQue,size),"consumer");
		prod.start();
		cons.start();
	}

}
