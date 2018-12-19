package ExceptionHandling;

import java.io.IOException;

public class TestExceptionPropagation1 {

	private void m() throws IOException {
		//int data = 5/0;
		 throw new IOException("device error");
	}
	/*private void n() throws IOException {
		m();
	}*/
	/*private void p() {
		try{
			n();
		}catch(Exception e){
			System.out.println(" exception handled");
		}
	}*/
	public static void main(String[] args)  {
		try{
		TestExceptionPropagation1 ts = new TestExceptionPropagation1();
		ts.m();
		}catch(Exception e) {System.out.println(e);}
		System.out.println("normal flow");

	}

}
