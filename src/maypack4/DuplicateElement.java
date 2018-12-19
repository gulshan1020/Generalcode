package maypack4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateElement {

	public static void main(String[] args) {
	
//		        int[] array = {1,1,2,3,4,5,6,7,8,8};
//		         
//		        Set<Integer> set = new HashSet<Integer>();
//		         
//		        for(int i = 0; i < array.length ; i++)
//		        {
//		            //If same integer is already present then add method will return FALSE
//		            if(!set.add(array[i]))
//		            {
//		                System.out.println("Duplicate element found : " + array[i]);
//		            }
//		        }
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");

		System.out.println("\nExample 1 - Count 'a' with frequency");
		System.out.println("a : " + Collections.frequency(list, "a"));

		System.out.println("\nExample 2 - Count all with frequency");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(list, temp));
		}

		System.out.println("\nExample 3 - Count all with Map");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);
					
		System.out.println("\nSorted Map");
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		printMap(treeMap);
			
	  }
		
	  public static void printMap(Map<String, Integer> map){

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
		}
			
	  
		    

	}

}
