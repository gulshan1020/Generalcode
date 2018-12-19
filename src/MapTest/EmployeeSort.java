/**
 * 
 */
package MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author Gulshan
 *
 */
public class EmployeeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Employee, Integer> map = new TreeMap<Employee, Integer>();
		Employee e1  = new Employee(100, "Ram", 10000);
		Employee e2  = new Employee(200, "Ravi", 20000);
		Employee e3  = new Employee(300, "sorabh", 30000);
		Employee e4  = new Employee(400, "abhishek", 40000);
		
		map.put(e1, 10000);
		map.put(e2, 20000);
		map.put(e3, 30000);
		map.put(e4, 40000);
		System.out.println(map.size());
		
	   for(Entry<Employee, Integer> m : map.entrySet()) {
		   System.out.println(m.getKey().getName() + "---" + m.getValue());
	   }
		
		
		
		
		

	}

}
