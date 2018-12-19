package Multithread;

public class Demo {
	private static String  str;
	public static void main(String[] args) {
		//str = "Hello";
		//System.out.println("Str:" +str);
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1==str2);
		System.out.println("----------------");
		
		int a=1,b=2,c=3,d;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a + b);
		System.out.println(b);

	}
	static{
		str = "hi";
		System.out.println("Str:" +str);
	}

}
