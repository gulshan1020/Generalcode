package maypack4;

public class methodoverloading {
	
	public static void m(String s) {
		System.out.println("in string");
	}
	
	public static  void m(Object s) {
		System.out.println("in object");
	}
	
	public static  void m(Integer s) {
		System.out.println("in integer");
	}

	public static void main(String[] args) {
		String s = null;
		m(s);

	}

}
