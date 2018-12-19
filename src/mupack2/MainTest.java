package mupack2;

import java.util.HashSet;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		/*List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("gulshan");
		list.add(e1);
		Collections.sort(list);
*/
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Set set = new HashSet();
		set.add(e1);
		set.add(e2);
		System.out.println(set.size());
		
	}
	

}
