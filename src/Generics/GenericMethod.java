package Generics;

public class GenericMethod {
	
	public static <T> boolean isEqual(GenericType<T> g1, GenericType<T>g2){
		return g1.getT().equals(g2.getT());
	}

	public static void main(String[] args) {
		GenericType<String> g1 = new GenericType<String>();
		g1.setT("GULSHAN");
		
		GenericType<String> g2 = new GenericType<String>();
		g2.setT("gulshan");
		
		boolean equal = GenericMethod.<String>isEqual(g1, g2);		
		boolean equal1 = GenericMethod.isEqual(g1, g2);   // type inference
		 
		System.out.println(equal1);
	}

}
