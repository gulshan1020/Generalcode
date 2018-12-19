package cloning;

public class Student implements Cloneable  {
	private int id;
	private String name;
  Course course;
	
	public Student(int id,String name,Course course){
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	

}
