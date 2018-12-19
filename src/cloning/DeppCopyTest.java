package cloning;

public class DeppCopyTest {

	public static void main(String[] args) {
		DeppCopyCourse dc = new DeppCopyCourse("Hindi","english","bio");
		DeepCopyStudent ds = new DeepCopyStudent(101, "Ravi", dc);
		DeepCopyStudent dst2 = null;
		try {
			dst2 = (DeepCopyStudent)ds.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		System.out.println(ds.deepcourse.subject1);
		dst2.deepcourse.subject1="commerce";
		System.out.println(ds.deepcourse.subject1);
	}

}
