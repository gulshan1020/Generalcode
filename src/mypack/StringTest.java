package mypack;

public class StringTest {

	public static void main(String[] args) {
		String str1="java";
		String str2="java";
		String str3= new String("java");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		//System.out.println(str1==str2);
		String st="studytonight";
		System.out.println(st.charAt(2));
		System.out.println(st.length());
		System.out.println(st.substring(4));
		Integer x=8;
		System.out.println(st.valueOf(x));
		Integer iob=100;  //autoboxing
		int y=iob; //unboxing
		Character ch='d';
		char c=ch;
		System.out.println(ch+ "/t"+c);
		System.out.println("iob:" +iob + "/t" + "y:" +y);
		System.out.println("---------------------------");
		StringBuilder strb =new StringBuilder("abc");
		StringBuilder stra = new StringBuilder("abc");
		System.out.println(strb.equals(stra));
		System.out.println(strb==stra);
		
		
		System.out.println(int[].class.isPrimitive());
		   System.out.println(int[].class.getName());
		   System.out.println(int[].class.getSuperclass());
		    
		   System.out.println(int.class.isPrimitive());
		   System.out.println(int.class.getName());
		   System.out.println(int.class.getSuperclass());
		 
		   //Object ref=new int[]{1,2,3};   // valid statement?
		 //  Object[] ref=new int[]{1,2,3}; // valid statement?

	}

}
