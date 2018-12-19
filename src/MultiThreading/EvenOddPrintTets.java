package MultiThreading;

class PrintEvenOdd implements Runnable {
	private boolean isEven;
	private Printer printer;
	private int max;
	
	public PrintEvenOdd(boolean isEven, Printer printer, int max) {
		this.isEven = isEven;
		this.printer = printer;
		this.max = max;
	}
	
	@Override
	public void run() {
		int number = isEven == true ? 2:1;
		while(number<=max){
			if(isEven){
				printer.printEven(number);
			}
			else {
				printer.printOdd(number);
			
			}
			number += 2;
		}
	}	
}


class Printer{
	boolean isodd;
	
	public Printer(boolean isodd) {
		this.isodd = isodd;
	}
	
	synchronized void printEven(int number) {
		while(isodd==false){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		System.out.println("even number :" +number);
		isodd = false;
		notifyAll();
	}
	
	synchronized void printOdd(int number) {
		while(isodd== true) {
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		System.out.println("odd number :" +number);
		isodd = true;
		notifyAll();
		
	}
	
}
public class EvenOddPrintTets {

	public static void main(String[] args) {
		Printer print = new Printer(false);
		Thread even = new Thread(new PrintEvenOdd(false,print,10));
		Thread odd = new Thread(new PrintEvenOdd(true,print,10));
		even.start();
		odd.start();
		
	
		
	}

}
