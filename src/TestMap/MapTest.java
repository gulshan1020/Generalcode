package TestMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
	Employee e1 = new Employee(1,"amit");
	Employee e2 = new Employee(1,"sumit");
	/*Set<Employee> set = new HashSet<Employee>();
	set.add(e1);
	set.add(e2);
	System.out.println(set.size());*/
	Map<Employee,String> a = new HashMap<Employee,String>();
	a.put(e1, "o");
	a.put(e2, "w");
	System.out.println(a.get(e2));
	System.out.println(a.get(e1));
	}
	//Map mp = new HashMap();

}
