package InnerClass;

@sky
public class TestAnonyms {

	public static void main(String[] args) {
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("nice person");
				
			}
		};
		
		p.eat();
	}

}
