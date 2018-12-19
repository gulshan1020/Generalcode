package cloning;

public class ShalowCopyTest {
	public static void main(String[] args) {
		Course science = new Course("physics", "chemistry", "maths");
		Student student1 = new Student (100,"ram",science);
		Student student2 = null;
		try{
			student2  = (Student)student1.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//System.out.println(student1)
		System.out.println(student1.course.subject1);
		student2.course.subject1 = "commerce";
		System.out.println(student1.course.subject1);
		
	}

}
