package cloning;

public class DeepCopyStudent implements Cloneable  {
	private int id;
	private String name;
	DeppCopyCourse deepcourse;
	
	public DeepCopyStudent(int id,String name,DeppCopyCourse course){
		this.id = id;
		this.name = name;
		this.deepcourse = course;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		DeepCopyStudent student = (DeepCopyStudent)super.clone();
		student.deepcourse = (DeppCopyCourse) deepcourse.clone();
		return student;
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
	public DeppCopyCourse getCourse() {
		return deepcourse;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(DeppCopyCourse course) {
		this.deepcourse = course;
	}
}
