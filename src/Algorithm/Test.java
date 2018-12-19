package Algorithm;


public class Test {
	public void m(double d,int x){
		System.out.println("double int");
	}
	public void m(double d,double x){
		System.out.println("double double");
	}
	/*public void m(int d,int x){
		System.out.println("int int");
	}*/
	public void m(int  d,double x){
		System.out.println("int double");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String>li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("C");
		
		for(String s:li){
			li.add("D");
		}
		System.out.println(li.size());*/
		Test t = new Test();
		t.m(10, 10);
		
		

	}

}
