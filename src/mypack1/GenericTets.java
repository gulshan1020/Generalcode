package mypack1;

public class GenericTets<T> {

	private T type;
	
	/**
	 * @param type
	 */
	public GenericTets(T type) {
		super();
		this.type = type;
	}


	/**
	 * @return the type
	 */
	public T getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(T type) {
		this.type = type;
	}
	public <T> void show(T t1,T t2) {
		System.out.println("hello");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
