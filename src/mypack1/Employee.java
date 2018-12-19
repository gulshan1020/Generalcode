package mypack1;

public class Employee implements Cloneable  {
	private String name;
	private String designation;
	
	public Employee() {
		this.setDesignation("programmer");
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	
}
	
	

}
