package ExceptionHandling;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//int[] a = new int[5];
		//a[5] = 30/0;
			int a = 30/0;
			System.out.println("hello");
		}catch(ArithmeticException e){System.out.println("task onr completed");}
		catch(ArrayIndexOutOfBoundsException e){System.out.println("task2 completed");}
		catch(NumberFormatException e){System.out.println("nober exception");}
		//catch(IOException e){System.out.println("nober exception");}
		catch(Exception e){System.out.println("task3 completed");}
		//
		/*finally{
			System.out.println("finally ee");
		}
		System.out.println("rest of the code");*/
	}

}
