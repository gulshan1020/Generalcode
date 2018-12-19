package InnerClass;

public class LocalInner {
	private int data = 20; 
	void display(){
		class local{
			protected int k = 20;
			void msg(){
				System.out.println(data + k);
			}
		}
		local l = new local();
		l.msg();
	}
	public static void main(String[] args) {
		
LocalInner obj = new LocalInner();
obj.display();
	}

}
