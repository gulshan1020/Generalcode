package mypack1;

public class ExcepTest {
	public static void main(String[] args) {
	
		int x= my();
		System.out.println(x);
} 
	public static int my() {
		try{
			int x =10/0;
			
			return 0;
			
		}/*catch(Exception e) {
			System.out.println("eon");
		}*/
		catch(ArithmeticException e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("in finally block");
		}
		return 1; 
	}
	
	public int my2() {
		int x1= my();
		return 0;
	}
}


