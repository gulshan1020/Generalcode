package mypack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HAshMapTest {

	public static void main(String[] args) {
	
		Employee[] empArr = new Employee[3];
		Map<String,Employee> m = new HashMap<String,Employee>();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("ram");
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("shyam");
		
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("gulshan");
		
		empArr[0] = e1;
		empArr[1] = e2;
		empArr[2] = e3;
		
		m.put("1", e1);
		m.put("2", e2);
		m.put(null, e1);		
		m.put("",e2);
		m.put("3",e3);
		
		System.out.println("map size:" +m.size());
		
		Iterator<Entry<String, Employee>> it = m.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,Employee> mapentry = (Map.Entry<String,Employee>) it.next();
			System.out.println("the key is :" +mapentry.getKey() + "value :" + mapentry.getValue());
		}
		
		for (Map.Entry<String, Employee> entry : m.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
		}
		
		//Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
		
	}

}
