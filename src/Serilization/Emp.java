package Serilization;

import java.io.Serializable;

public class Emp implements Serializable {
	//private static final long serialVersionUID = 1L;
	private String name;
	private static int id;
	static {
		id = 100;
	}
	public Emp(String name, int id){
		this.name = name;
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
