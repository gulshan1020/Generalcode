package InnerClass;

public interface A {
	public int b = 20;
	
	public class B{
		private int k;
		public void show(){
			//k=50;
			System.out.println("in interface inner class" +b);
		}
	}

}
