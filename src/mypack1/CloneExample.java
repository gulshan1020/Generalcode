package mypack1;

public class CloneExample {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Gulshan");
	//	e1.setDesignation("java developer");
		try {
			Employee e2 = (Employee)e1.clone();
			System.out.println(e2.getName());
			System.out.println(e2.getDesignation());
		} catch(CloneNotSupportedException e) {
			System.out.println("clonable should be implemented" +e);
		}

	}

}
