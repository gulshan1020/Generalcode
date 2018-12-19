package InnerClass;

public class TestInner {

	public static void main(String[] args) {
		/*MemberInner mi = new MemberInner();
		MemberInner.A in = mi.new A();
		in.show();*/
		
		// by interface inner class implementation
		A.B by = new A.B();
		by.show();
		

	}

}
