package mypack;

public class Childclass extends BaseClass  {
	/*public Childclass(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}*/
	public void msg(String s) {
		System.out.println("in child class" +s);
	}
	public void msg(Object s) {
		System.out.println("in child class" +s);
	}


	public static void main(String[] args) {
		
		BaseClass b = new BaseClass();
		b.msg(null);

	}

}
